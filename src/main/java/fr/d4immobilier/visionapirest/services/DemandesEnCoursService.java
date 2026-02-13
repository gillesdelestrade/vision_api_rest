package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.DemandesEnCoursDTO;
import fr.d4immobilier.visionapirest.dto.DemandesEnCoursDTO.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Stateless
public class DemandesEnCoursService {

    @PersistenceContext
    private EntityManager em;

    private static final int DEMANDES_COURANTES = 0;
    private static final int DEMANDES_URGENTES = 1;
    private static final int DOSSIERS_PERMANENTS = 2;

    // Couleurs kanban : index enum -> hex (reproduit CouleurEtatKanban.toHex())
    private static final String[] COULEURS_KANBAN = {"#0000FF", "#00FF00", "#FFFF00", "#FF0000"}; // BLEU, VERT, JAUNE, ROUGE

    /**
     * Point d'entrée principal.
     * Reproduit la logique de ActionEnCoursVueCoproprietaireServlet
     * pour le rôle Gestionnaire (vue complète).
     */
    public DemandesEnCoursDTO getDemandesEnCours(Long coproprieteId) {

        // ---- 1. Charger les actions non acquittées ----
        List<Map<String, Object>> actions = loadActions(coproprieteId);

        // ---- 2. Charger les demandes en cours (non épinglées) ----
        List<Map<String, Object>> demandes = loadDemandes(coproprieteId);

        // ---- 3. Charger les demandes épinglées ----
        List<Map<String, Object>> demandesEpinglees = loadDemandesEpinglees(coproprieteId);

        // ---- 4. Charger les procédures en cours (non épinglées ajoutées aux demandes) ----
        List<Map<String, Object>> procedures = loadProcedures(coproprieteId);
        for (Map<String, Object> proc : procedures) {
            if (!Boolean.TRUE.equals(proc.get("epingle"))) {
                demandes.add(proc);
            }
        }

        // ---- 5. Charger les IDs demandes dernier comm pas gestionnaire ----
        List<Long> idsCommPasD4 = loadIdsCommPasGestionnaire(coproprieteId);

        // ---- 6. Charger la map kanban (reproduit DemandeDAO.getIdsDemandeDansUnKanbanAvecCouleur) ----
        Map<Long, String> mapKanban = loadKanbanCouleurs(coproprieteId);

        // ---- 7. Trier dans les familles (urgentes / dossier permanent / courantes) ----
        Map<Integer, Set<Long>> famillesIds = new HashMap<>();
        famillesIds.put(DEMANDES_COURANTES, new LinkedHashSet<>());
        famillesIds.put(DEMANDES_URGENTES, new LinkedHashSet<>());
        famillesIds.put(DOSSIERS_PERMANENTS, new LinkedHashSet<>());

        List<Map<String, Object>> toutesLesDemandes = new ArrayList<>(demandes);
        toutesLesDemandes.addAll(demandesEpinglees);

        for (Map<String, Object> d : toutesLesDemandes) {
            Long id = (Long) d.get("id");
            boolean urgent = "URGENT".equals(d.get("urgenceStr"));
            boolean dossierPermanent = Boolean.TRUE.equals(d.get("dossierPermanent"));

            famillesIds.get(DEMANDES_COURANTES).add(id);
            if (urgent) {
                famillesIds.get(DEMANDES_URGENTES).add(id);
                if (dossierPermanent) {
                    famillesIds.get(DOSSIERS_PERMANENTS).add(id);
                }
            } else if (dossierPermanent) {
                famillesIds.get(DOSSIERS_PERMANENTS).add(id);
            }
        }

        // ---- 8. Tri par période ----
        // 8a. Actions : dateCreation
        Map<Long, Instant> mapActionDate = new HashMap<>();
        for (Map<String, Object> a : actions) {
            if (a.get("dateCreation") instanceof Instant) {
                mapActionDate.put((Long) a.get("id"), (Instant) a.get("dateCreation"));
            }
        }

        // 8b. Demandes : max(dateevenement) depuis evenementdemande
        Map<Long, Instant> mapDemandeDate = loadMapDemandeDate(toutesLesDemandes);

        // Construire les périodes
        List<String> titresPeriodes = new ArrayList<>();
        Map<String, Instant[]> bornesPeriodes = new LinkedHashMap<>();
        buildPeriodes(titresPeriodes, bornesPeriodes);

        // Distribuer actions par période
        Map<String, List<Map<String, Object>>> actionsParPeriode = distribuerParPeriode(actions, mapActionDate, titresPeriodes, bornesPeriodes);
        // Distribuer demandes par période (épinglées dans "A surveiller")
        Map<String, List<Map<String, Object>>> demandesParPeriode = distribuerDemandesParPeriode(demandes, demandesEpinglees, mapDemandeDate, titresPeriodes, bornesPeriodes);

        // ---- 9. Construire le DTO ----
        DemandesEnCoursDTO result = new DemandesEnCoursDTO();
        List<GroupeDemandesDTO> groupes = new ArrayList<>();

        String[] nomsFamilles = {"Demandes Courantes", "Demandes Urgentes", "Dossiers Permanents"};

        for (int i = 0; i < 3; i++) {
            GroupeDemandesDTO groupe = new GroupeDemandesDTO();
            groupe.setId(i);
            groupe.setLibelle(nomsFamilles[i]);

            List<PeriodeDTO> periodes = new ArrayList<>();
            Set<Long> idsFamille = famillesIds.get(i);

            for (String titre : titresPeriodes) {
                List<Map<String, Object>> demandesPeriode = demandesParPeriode.getOrDefault(titre, Collections.emptyList());
                List<Map<String, Object>> actionsPeriode = actionsParPeriode.getOrDefault(titre, Collections.emptyList());

                // Filtrer les demandes de cette famille
                List<Map<String, Object>> demandesFiltrees = demandesPeriode.stream()
                    .filter(d -> idsFamille.contains(d.get("id")))
                    .collect(Collectors.toList());

                // Période vide ? on l'omet (sauf si actions pour Demandes Courantes)
                if (demandesFiltrees.isEmpty() && (i != DEMANDES_COURANTES || actionsPeriode.isEmpty())) {
                    continue;
                }

                PeriodeDTO periode = new PeriodeDTO();
                periode.setTitre(titre);

                // Actions uniquement pour Demandes Courantes
                if (i == DEMANDES_COURANTES) {
                    periode.setActions(actionsPeriode.stream()
                        .map(this::toActionDTO)
                        .collect(Collectors.toList()));
                }

                // Trier demandes par ID desc (reverseOrder comme dans la servlet)
                demandesFiltrees.sort((a, b) -> Long.compare((Long) b.get("id"), (Long) a.get("id")));
                periode.setDemandes(demandesFiltrees.stream()
                    .map(d -> toDemandeDTO(d, idsCommPasD4, mapKanban))
                    .collect(Collectors.toList()));

                periodes.add(periode);
            }
            groupe.setPeriodes(periodes);
            groupes.add(groupe);
        }

        result.setGroupesDemandes(groupes);
        return result;
    }

    // ================================================================
    //  MÉTHODES DE CHARGEMENT SQL
    // ================================================================

    /**
     * Actions non acquittées pour une copropriété.
     * Reproduit ActionDAO.getActionsNonAck(Copropriete)
     */
    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> loadActions(Long coproprieteId) {
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String sql = "SELECT ACTION.ID, " +           // 0
            "ACTION.DATECREATION, " +                  // 1
            "ACTION.LIBELLE, " +                       // 2
            "ACTION.DTYPE, " +                         // 3
            "ACTION.DEMANDE_ID, " +                    // 4
            "PERSONNE.ID, " +                          // 5
            "PERSONNE.PRENOM, " +                      // 6
            "PERSONNE.NOM, " +                         // 7
            "COPROPRIETE.TRIGRAMME, " +                // 8
            "ACTION.NOTBEFORE, " +                     // 9
            "ACTION.DATESIGNALETERMINEPARCOPROPRIETAIRE " + // 10
            "FROM (ACTION INNER JOIN COPROPRIETE ON COPROPRIETE.ID=ACTION.COPROPRIETE_ID) " +
            "INNER JOIN PERSONNE ON PERSONNE.ID=ACTION.EXECUTEUR_ID " +
            "WHERE ACTION.DATEREALISATION IS NULL " +
            "AND ACTION.COPROPRIETE_ID=" + coproprieteId +
            " AND (ACTION.NOTBEFORE IS NULL OR ACTION.NOTBEFORE<='" + date + "') " +
            "ORDER BY ACTION.URGENCE DESC, ACTION.IMPORTANCE DESC";

        List<Map<String, Object>> result = new ArrayList<>();
        for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
            Map<String, Object> m = new HashMap<>();
            m.put("id", r[0]);
            m.put("dateCreation", r[1]);
            String libelle = r[2] != null ? (String) r[2] : "";
            m.put("libelle", libelle.substring(0, Math.min(libelle.length(), 100)));
            m.put("dtype", r[3]);
            m.put("demandeId", r[4]);
            m.put("executeurId", r[5]);
            m.put("executeurPrenom", r[6] != null ? (String) r[6] : "");
            m.put("executeurNom", r[7] != null ? (String) r[7] : "");
            m.put("trigramme", r[8]);
            m.put("notBefore", r[9]);
            m.put("signaleTermine", r[10] != null);
            result.add(m);
        }
        return result;
    }

    /**
     * Demandes en cours (non épinglées, notBefore respecté).
     * Reproduit DemandeDAO.getDemandesEnCoursVueCoproprietaire(Copropriete)
     */
    private List<Map<String, Object>> loadDemandes(Long coproprieteId) {
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String sql = "SELECT DISTINCT DEMANDE.ID, " +               // 0
            "DEMANDE.DESCRIPTION, " +                                // 1
            "COPROPRIETE.TRIGRAMME, " +                              // 2
            "ATTRIBUTAIRE.NOM, " +                                   // 3
            "ATTRIBUTAIRE.PRENOM, " +                                // 4
            "DEMANDE.DATECONSTAT, " +                                // 5
            "ATTRIBUTAIRE.ID, " +                                    // 6
            "DEMANDE.ETATDEMANDE, " +                                // 7
            "DEMANDE.NOTBEFORE, " +                                  // 8
            "EQUIPEMENT.ID, " +                                      // 9
            "EQUIPEMENT.LIBELLE, " +                                 // 10
            "DEMANDE.URGENCE, " +                                    // 11
            "DEMANDE.IMPORTANCE, " +                                 // 12
            "GESTIONNAIRE.ID, " +                                    // 13
            "GESTIONNAIRE.NOM, " +                                   // 14
            "GESTIONNAIRE.PRENOM, " +                                // 15
            "EMETTEUR.ID, " +                                        // 16
            "EMETTEUR.NOM, " +                                       // 17
            "EMETTEUR.PRENOM, " +                                    // 18
            "BATIMENT.ID, " +                                        // 19
            "BATIMENT.LIBELLE, " +                                   // 20
            "DEMANDE.DATEDEMANDECLOTURECOPROPRIETAIRE, " +           // 21
            "DEMANDE.DTYPE, " +                                      // 22
            "DEMANDE.NUMERO, " +                                     // 23
            "DEMANDE.DOSSIERPERMANENT, " +                           // 24
            "DEMANDE.SUIVICS, " +                                    // 25
            "DEMANDE.AG, " +                                         // 26
            "DEMANDE.VISIBLEPARCOPROPRIETAIRES, " +                  // 27
            "DEMANDE.VISIBLEPARLECS " +                              // 28
            "FROM ((((DEMANDE " +
            "LEFT JOIN PERSONNE AS EMETTEUR ON DEMANDE.EMETTEUR_ID=EMETTEUR.ID) " +
            "INNER JOIN (COPROPRIETE INNER JOIN PERSONNE AS GESTIONNAIRE ON COPROPRIETE.GESTIONNAIRE_ID=GESTIONNAIRE.ID) " +
            "ON DEMANDE.COPROPRIETE_ID=COPROPRIETE.ID) " +
            "LEFT OUTER JOIN PERSONNE AS ATTRIBUTAIRE ON DEMANDE.ATTRIBUTAIRE_ID=ATTRIBUTAIRE.ID) " +
            "LEFT OUTER JOIN DEMANDE_PERSONNE ON DEMANDE.ID=DEMANDE_PERSONNE.historiqueDemandesAttribuees_ID) " +
            "LEFT JOIN (EQUIPEMENT LEFT JOIN BATIMENT ON EQUIPEMENT.BATIMENT_ID=BATIMENT.ID) " +
            "ON EQUIPEMENT.ID=DEMANDE.EQUIPEMENT_ID " +
            "WHERE (DEMANDE.DATECLOTUREPARD4 IS NULL AND DEMANDE.DATECLOTUREDEFINITIVE IS NULL) " +
            "AND (LOWER(DEMANDE.DTYPE) LIKE 'demande%' OR DEMANDE.DTYPE='Sinistre') " +
            "AND COPROPRIETE.ID=" + coproprieteId +
            " AND (DEMANDE.EPINGLE IS NULL OR DEMANDE.EPINGLE='0') " +
            "AND (DEMANDE.NOTBEFORE IS NULL OR DEMANDE.NOTBEFORE<='" + date + "')";

        return parseDemandes(sql);
    }

    /**
     * Demandes épinglées.
     * Reproduit DemandeDAO.getDemandesEpinglees(Copropriete)
     */
    private List<Map<String, Object>> loadDemandesEpinglees(Long coproprieteId) {
        String sql = "SELECT DISTINCT DEMANDE.ID, " +               // 0
            "DEMANDE.DESCRIPTION, " +                                // 1
            "COPROPRIETE.TRIGRAMME, " +                              // 2
            "PERSONNE.NOM, " +                                       // 3
            "PERSONNE.PRENOM, " +                                    // 4
            "DEMANDE.DATECONSTAT, " +                                // 5
            "PERSONNE.ID, " +                                        // 6
            "DEMANDE.ETATDEMANDE, " +                                // 7
            "DEMANDE.NOTBEFORE, " +                                  // 8
            "EQUIPEMENT.ID, " +                                      // 9
            "EQUIPEMENT.LIBELLE, " +                                 // 10
            "DEMANDE.URGENCE, " +                                    // 11
            "DEMANDE.IMPORTANCE, " +                                 // 12
            "GESTIONNAIRE.ID, " +                                    // 13
            "GESTIONNAIRE.NOM, " +                                   // 14
            "GESTIONNAIRE.PRENOM, " +                                // 15
            "DEMANDE.NUMERO, " +                                     // 16
            "DEMANDE.DOSSIERPERMANENT, " +                           // 17
            "DEMANDE.SUIVICS, " +                                    // 18
            "DEMANDE.AG, " +                                         // 19
            "DEMANDE.DTYPE, " +                                      // 20
            "DEMANDE.VISIBLEPARCOPROPRIETAIRES, " +                  // 21
            "DEMANDE.VISIBLEPARLECS " +                              // 22
            "FROM (((DEMANDE " +
            "INNER JOIN (COPROPRIETE INNER JOIN PERSONNE AS GESTIONNAIRE ON COPROPRIETE.GESTIONNAIRE_ID=GESTIONNAIRE.ID) " +
            "ON DEMANDE.COPROPRIETE_ID=COPROPRIETE.ID) " +
            "LEFT OUTER JOIN PERSONNE ON DEMANDE.ATTRIBUTAIRE_ID=PERSONNE.ID) " +
            "LEFT OUTER JOIN DEMANDE_PERSONNE ON DEMANDE.ID=DEMANDE_PERSONNE.historiqueDemandesAttribuees_ID) " +
            "LEFT JOIN EQUIPEMENT ON EQUIPEMENT.ID=DEMANDE.EQUIPEMENT_ID " +
            "WHERE (DEMANDE.DATECLOTUREPARD4 IS NULL OR DEMANDE.DATECLOTUREDEFINITIVE IS NULL) " +
            "AND (LOWER(DEMANDE.DTYPE) LIKE 'demande%' OR LOWER(DEMANDE.DTYPE) LIKE 'sinistre%' OR LOWER(DEMANDE.DTYPE) LIKE 'procedure%') " +
            "AND COPROPRIETE.ID=" + coproprieteId +
            " AND EPINGLE='1'";

        return parseDemandesEpinglees(sql);
    }

    /**
     * Procédures en cours.
     * Reproduit ProcedureDAO.getProceduresEnCours(Copropriete)
     */
    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> loadProcedures(Long coproprieteId) {
        String sql = "SELECT DEMANDE.ID, DEMANDE.DESCRIPTION, DEMANDE.DATECONSTAT, " +
            "DEMANDE.TITRE, EQUIPEMENT.ID, EQUIPEMENT.LIBELLE, DEMANDE.EPINGLE " +
            "FROM DEMANDE LEFT JOIN EQUIPEMENT ON DEMANDE.EQUIPEMENT_ID=EQUIPEMENT.ID " +
            "WHERE DTYPE='Procedure' AND DATECLOTUREDEFINITIVE IS NULL " +
            "AND DEMANDE.COPROPRIETE_ID=" + coproprieteId;

        List<Map<String, Object>> result = new ArrayList<>();
        for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
            Map<String, Object> m = new HashMap<>();
            m.put("id", r[0]);
            m.put("description", r[1] != null ? r[1] : (r[3] != null ? r[3] : "Procédure"));
            m.put("dateConstat", r[2]);
            m.put("dtype", "Procedure");
            m.put("epingle", r[6] != null && Boolean.TRUE.equals(r[6]));
            m.put("procedure", true);
            m.put("urgenceStr", "");
            m.put("dossierPermanent", false);
            m.put("suiviCS", false);
            m.put("ag", false);
            m.put("visibleParCoproprietaires", false);
            m.put("visibleParLeCS", false);
            if (r[4] != null) {
                m.put("equipementId", r[4]);
                m.put("equipement", r[5]);
            }
            result.add(m);
        }
        return result;
    }

    /**
     * IDs des demandes dont le dernier commentaire n'est PAS d'un gestionnaire.
     * Reproduit DemandeDAO.getIdsDemandeDernierCommentairePasGestionnaire(Copropriete)
     */
    @SuppressWarnings("unchecked")
    private List<Long> loadIdsCommPasGestionnaire(Long coproprieteId) {
        try {
            String sql = "SELECT DISTINCT d.id FROM demande d " +
                "INNER JOIN evenementdemande e ON e.demande_id = d.id " +
                "INNER JOIN personne p ON e.auteur_id = p.id " +
                "WHERE d.copropriete_id = " + coproprieteId +
                " AND d.datecloturedefinitive IS NULL " +
                " AND d.datecloturepard4 IS NULL " +
                " AND e.dateevenement = (SELECT MAX(e2.dateevenement) FROM evenementdemande e2 WHERE e2.demande_id = d.id) " +
                " AND p.dtype <> 'Gestionnaire'";
            return em.createNativeQuery(sql).getResultList();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    /**
     * Couleurs kanban par demande.
     * Reproduit exactement DemandeDAO.getIdsDemandeDansUnKanbanAvecCouleur(Copropriete)
     */
    @SuppressWarnings("unchecked")
    private Map<Long, String> loadKanbanCouleurs(Long coproprieteId) {
        Map<Long, String> map = new HashMap<>();
        try {
            String sql = "SELECT DEMANDE.ID, COULEURETATKANBAN " +
                "FROM DEMANDE INNER JOIN (JOURNALETATKANBAN INNER JOIN ETATKANBAN ON JOURNALETATKANBAN.ETATKANBAN_ID=ETATKANBAN.ID) " +
                "ON JOURNALETATKANBAN.DEMANDE_ID=DEMANDE.ID " +
                "WHERE DEMANDE.DATECLOTUREDEFINITIVE IS NULL " +
                "AND DEMANDE.COPROPRIETE_ID=" + coproprieteId +
                " AND JOURNALETATKANBAN.DATESORTIE IS NULL";

            for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
                Long id = (Long) r[0];
                if (!map.containsKey(id) && r[1] != null) {
                    int idx = ((Number) r[1]).intValue();
                    if (idx >= 0 && idx < COULEURS_KANBAN.length) {
                        map.put(id, COULEURS_KANBAN[idx]);
                    }
                }
            }
        } catch (Exception e) {
            // Table peut ne pas exister dans certains environnements
        }
        return map;
    }

    // ================================================================
    //  PARSEURS DE RÉSULTATS SQL
    // ================================================================

    /**
     * Parse les demandes en cours (29 colonnes).
     */
    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> parseDemandes(String sql) {
        List<Map<String, Object>> result = new ArrayList<>();
        Set<Long> idsDejaVus = new HashSet<>();

        for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
            Long id = (Long) r[0];
            if (idsDejaVus.contains(id)) continue;
            idsDejaVus.add(id);

            Map<String, Object> m = new HashMap<>();
            m.put("id", id);
            m.put("description", r[1] != null && !((String) r[1]).isEmpty() ? r[1] : "Pas de texte");
            m.put("trigramme", r[2]);
            // Attributaire (ou gestionnaire copropriété par défaut)
            if (r[3] != null) {
                m.put("attributaireId", r[6]);
                m.put("attributaireNom", r[3]);
                m.put("attributairePrenom", r[4]);
            } else {
                m.put("attributaireId", r[13]);
                m.put("attributaireNom", r[14]);
                m.put("attributairePrenom", r[15]);
            }
            m.put("dateConstat", r[5]);
            m.put("etatDemande", r[7] != null ? r[7] : 0);
            m.put("notBefore", r[8]);
            m.put("equipementId", r[9]);
            m.put("equipement", r[10]);
            // Urgence
            int urgIdx = r[11] != null ? ((Number) r[11]).intValue() : 0;
            m.put("urgenceStr", urgIdx == 1 ? "URGENT" : "");
            m.put("emetteurId", r[16]);
            m.put("emetteurNom", r[17]);
            m.put("emetteurPrenom", r[18]);
            m.put("batimentId", r[19]);
            m.put("batimentLibelle", r[20]);
            m.put("dateDemandeCloture", r[21]);
            m.put("dtype", r[22]);
            m.put("numero", r[23]);
            m.put("dossierPermanent", r[24] != null && Boolean.TRUE.equals(r[24]));
            m.put("suiviCS", r[25] != null && Boolean.TRUE.equals(r[25]));
            m.put("ag", r[26] != null && Boolean.TRUE.equals(r[26]));
            m.put("visibleParCoproprietaires", r[27] != null && Boolean.TRUE.equals(r[27]));
            m.put("visibleParLeCS", r[28] != null && Boolean.TRUE.equals(r[28]));
            m.put("epingle", false);
            m.put("procedure", false);
            result.add(m);
        }
        return result;
    }

    /**
     * Parse les demandes épinglées (23 colonnes - structure différente du DAO original).
     */
    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> parseDemandesEpinglees(String sql) {
        List<Map<String, Object>> result = new ArrayList<>();
        Set<Long> idsDejaVus = new HashSet<>();

        for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
            Long id = (Long) r[0];
            if (idsDejaVus.contains(id)) continue;
            idsDejaVus.add(id);

            Map<String, Object> m = new HashMap<>();
            m.put("id", id);
            m.put("description", r[1] != null ? r[1] : "Pas de texte");
            m.put("trigramme", r[2]);
            // Attributaire (ou gestionnaire par défaut)
            if (r[3] != null) {
                m.put("attributaireId", r[6]);
                m.put("attributaireNom", r[3]);
                m.put("attributairePrenom", r[4]);
            } else {
                m.put("attributaireId", r[13]);
                m.put("attributaireNom", r[14]);
                m.put("attributairePrenom", r[15]);
            }
            m.put("dateConstat", r[5]);
            m.put("etatDemande", r[7] != null ? r[7] : 0);
            m.put("notBefore", r[8]);
            m.put("equipementId", r[9]);
            m.put("equipement", r[10]);
            int urgIdx = r[11] != null ? ((Number) r[11]).intValue() : 0;
            m.put("urgenceStr", urgIdx == 1 ? "URGENT" : "");
            m.put("numero", r[16]);
            m.put("dossierPermanent", r[17] != null && Boolean.TRUE.equals(r[17]));
            m.put("suiviCS", r[18] != null && Boolean.TRUE.equals(r[18]));
            m.put("ag", r[19] != null && Boolean.TRUE.equals(r[19]));
            m.put("dtype", r[20]);
            m.put("visibleParCoproprietaires", r[21] != null && Boolean.TRUE.equals(r[21]));
            m.put("visibleParLeCS", r[22] != null && Boolean.TRUE.equals(r[22]));
            m.put("epingle", true);
            m.put("procedure", "Procedure".equalsIgnoreCase(r[20] != null ? (String) r[20] : ""));
            // Champs absents de cette requête
            m.put("emetteurId", null);
            m.put("emetteurNom", null);
            m.put("emetteurPrenom", null);
            m.put("batimentId", null);
            m.put("batimentLibelle", null);
            m.put("dateDemandeCloture", null);
            result.add(m);
        }
        return result;
    }

    // ================================================================
    //  DATE DU DERNIER ÉVÉNEMENT PAR DEMANDE
    // ================================================================

    /**
     * Reproduit DemandeDAO.getMapDemandeDate() :
     * SELECT demande_id, MAX(dateevenement) FROM evenementdemande GROUP BY demande_id
     */
    @SuppressWarnings("unchecked")
    private Map<Long, Instant> loadMapDemandeDate(List<Map<String, Object>> demandes) {
        Map<Long, Instant> map = new HashMap<>();
        if (demandes.isEmpty()) return map;

        StringBuilder ids = new StringBuilder();
        for (Map<String, Object> d : demandes) {
            if (ids.length() > 0) ids.append(",");
            ids.append(d.get("id"));
        }

        String sql = "SELECT demande_id, MAX(dateevenement) FROM evenementdemande " +
            "WHERE demande_id IN (" + ids + ") GROUP BY demande_id";

        try {
            for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
                map.put((Long) r[0], (Instant) r[1]);
            }
        } catch (Exception e) {
            // Fallback : utiliser dateConstat
            for (Map<String, Object> d : demandes) {
                if (d.get("dateConstat") instanceof Instant) {
                    map.put((Long) d.get("id"), (Instant) d.get("dateConstat"));
                }
            }
        }
        return map;
    }

    // ================================================================
    //  CONSTRUCTION DES PÉRIODES
    // ================================================================

    /**
     * Construit les 10 périodes exactement comme la servlet :
     * "A surveiller", "Mois en cours", M-1..M-6, "Plus tôt dans l'année XXXX", "année XXXX"
     */
    private void buildPeriodes(List<String> titres, Map<String, Instant[]> bornes) {
        ZoneId zone = ZoneId.systemDefault();
        LocalDate now = LocalDate.now();

        // "A surveiller" - période spéciale pour les épinglées
        titres.add("A surveiller");
        bornes.put("A surveiller", null);

        // "Mois en cours" : du 1er du mois courant à maintenant
        Instant debutMoisCourant = now.withDayOfMonth(1).atStartOfDay(zone).toInstant();
        titres.add("Mois en cours");
        bornes.put("Mois en cours", new Instant[]{debutMoisCourant, Instant.now()});

        // M-1 à M-6
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.FRANCE);
        LocalDate c = now.minusMonths(1);
        for (int i = 1; i <= 6; i++) {
            String titre = c.format(fmt);
            Instant debut = c.withDayOfMonth(1).atStartOfDay(zone).toInstant();
            Instant fin = c.plusMonths(1).withDayOfMonth(1).atStartOfDay(zone).toInstant();
            titres.add(titre);
            bornes.put(titre, new Instant[]{debut, fin});
            c = c.minusMonths(1);
        }

        // "Plus tôt dans l'année XXXX" (année du mois M-6)
        // c est maintenant à M-7 après la boucle, on recalcule
        LocalDate moisM6 = now.minusMonths(7); // c après la boucle = now-7
        // En fait la servlet fait : c = now-1, puis c = c-1 (6 fois) -> c = now-7
        // Le titre est "Plus tôt dans l'année " + c.format("yyyy") où c = now-7
        String anneeStr = c.format(DateTimeFormatter.ofPattern("yyyy"));
        String titrePlusTot = "Plus tôt dans l'année " + anneeStr;
        Instant debutAnnee = LocalDate.of(c.getYear(), 1, 1).atStartOfDay(zone).toInstant();
        Instant finPlusTot = c.plusMonths(1).withDayOfMonth(1).atStartOfDay(zone).toInstant();
        titres.add(titrePlusTot);
        bornes.put(titrePlusTot, new Instant[]{debutAnnee, finPlusTot});

        // "année XXXX" (année précédente de c)
        c = c.minusYears(1);
        String titreAvant = "année " + c.format(DateTimeFormatter.ofPattern("yyyy"));
        Instant finAvant = debutAnnee;
        titres.add(titreAvant);
        bornes.put(titreAvant, new Instant[]{Instant.EPOCH, finAvant});
    }

    // ================================================================
    //  DISTRIBUTION PAR PÉRIODE
    // ================================================================

    /**
     * Distribue une liste d'items dans les périodes selon leur date.
     * Chaque item va dans une seule période (la première qui matche).
     */
    private Map<String, List<Map<String, Object>>> distribuerParPeriode(
            List<Map<String, Object>> items, Map<Long, Instant> dateMap,
            List<String> titres, Map<String, Instant[]> bornes) {

        Map<String, List<Map<String, Object>>> result = new LinkedHashMap<>();
        for (String t : titres) result.put(t, new ArrayList<>());

        Set<Long> distribues = new HashSet<>();
        // Parcourir les périodes dans l'ordre (mois en cours d'abord, puis M-1, etc.)
        for (String titre : titres) {
            if ("A surveiller".equals(titre)) continue;
            Instant[] b = bornes.get(titre);
            if (b == null) continue;
            for (Map<String, Object> item : items) {
                Long id = (Long) item.get("id");
                if (distribues.contains(id)) continue;
                Instant date = dateMap.get(id);
                if (date != null && !date.isBefore(b[0]) && date.isBefore(b[1])) {
                    result.get(titre).add(item);
                    distribues.add(id);
                }
            }
        }
        // Les restants (sans date ou hors bornes) vont dans la dernière période
        String dernierTitre = titres.get(titres.size() - 1);
        for (Map<String, Object> item : items) {
            Long id = (Long) item.get("id");
            if (!distribues.contains(id)) {
                result.get(dernierTitre).add(item);
                distribues.add(id);
            }
        }
        return result;
    }

    /**
     * Distribue les demandes par période. Les épinglées vont dans "A surveiller".
     */
    private Map<String, List<Map<String, Object>>> distribuerDemandesParPeriode(
            List<Map<String, Object>> demandes, List<Map<String, Object>> epinglees,
            Map<Long, Instant> dateMap, List<String> titres, Map<String, Instant[]> bornes) {

        Map<String, List<Map<String, Object>>> result = distribuerParPeriode(demandes, dateMap, titres, bornes);
        result.get("A surveiller").addAll(epinglees);
        return result;
    }

    // ================================================================
    //  CONVERSION EN DTOs
    // ================================================================

    private ActionDTO toActionDTO(Map<String, Object> m) {
        ActionDTO dto = new ActionDTO();
        dto.setId((Long) m.get("id"));
        dto.setCopropriete((String) m.get("trigramme"));
        dto.setExecuteurId((Long) m.get("executeurId"));
        String prenom = (String) m.get("executeurPrenom");
        String nom = (String) m.get("executeurNom");
        dto.setExecuteurInitiales(
            (prenom != null && !prenom.isEmpty() ? prenom.substring(0, 1) : "") +
            (nom != null && !nom.isEmpty() ? nom.substring(0, 1) : "")
        );
        dto.setLibelle((String) m.get("libelle"));
        dto.setPvAG("ActionPVAG".equals(m.get("dtype")));
        dto.setDemandeId(m.get("demandeId") != null ? (Long) m.get("demandeId") : null);
        dto.setDirectementImplique(true);
        dto.setSignaleTermineParCoproprietaire(Boolean.TRUE.equals(m.get("signaleTermine")));

        if (m.get("notBefore") != null) {
            dto.setNotBefore(parseNotBefore(m.get("notBefore")));
        }
        return dto;
    }

    private DemandeDTO toDemandeDTO(Map<String, Object> m, List<Long> idsCommPasD4, Map<Long, String> mapKanban) {
        DemandeDTO dto = new DemandeDTO();
        Long id = (Long) m.get("id");
        dto.setId(id);

        // Description (nettoyée comme dans la servlet)
        String desc = m.get("description") != null ? (String) m.get("description") : " - ";
        dto.setDescription(desc);

        // DateConstat
        if (m.get("dateConstat") instanceof Instant) {
            Instant dc = (Instant) m.get("dateConstat");
            dto.setDateConstat(dc.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        } else {
            dto.setDateConstat("");
        }

        // Equipement
        dto.setEquipement(m.get("equipement") != null ? m.get("equipement").toString() : null);
        dto.setEquipementId(m.get("equipementId") != null ? ((Number) m.get("equipementId")).longValue() : null);

        // Attributaire
        dto.setAttributaireId(m.get("attributaireId") != null ? ((Number) m.get("attributaireId")).longValue() : null);
        String aNom = m.get("attributaireNom") != null ? (String) m.get("attributaireNom") : "";
        String aPrenom = m.get("attributairePrenom") != null ? (String) m.get("attributairePrenom") : "";
        dto.setAttributaireInitiales(
            (aPrenom.isEmpty() ? "" : aPrenom.substring(0, 1)) +
            (aNom.isEmpty() ? "" : aNom.substring(0, 1))
        );

        // Trigramme
        dto.setTrigramme(m.get("trigramme") != null ? (String) m.get("trigramme") : "");

        // EtatDemande
        if (m.get("etatDemande") != null) {
            int idx = ((Number) m.get("etatDemande")).intValue();
            String[] etats = {"OUVERT", "PRIS_EN_COMPTE", "CLOTURE_D4", "CLOTURE_DEFINITIVEMENT", "A_PRENDRE_EN_COMPTE"};
            dto.setEtatDemande(idx >= 0 && idx < etats.length ? etats[idx] : "OUVERT");
        } else {
            dto.setEtatDemande("OUVERT");
        }

        // NotBefore
        if (m.get("notBefore") != null) {
            dto.setNotBefore(parseNotBefore(m.get("notBefore")));
        }

        // Epinglé
        dto.setEpingle(Boolean.TRUE.equals(m.get("epingle")));

        // Emetteur
        if (m.get("emetteurId") != null) {
            EmetteurDTO emDto = new EmetteurDTO();
            emDto.setId(((Number) m.get("emetteurId")).longValue());
            emDto.setNom(m.get("emetteurNom") != null ? (String) m.get("emetteurNom") : "");
            dto.setEmetteur(emDto);
        }

        // Batiment
        if (m.get("batimentId") != null) {
            BatimentDTO bat = new BatimentDTO();
            bat.setId(((Number) m.get("batimentId")).longValue());
            bat.setLibelle(m.get("batimentLibelle") != null ? (String) m.get("batimentLibelle") : "");
            dto.setBatiment(bat);
        }

        // Demande cloture coproprietaire
        dto.setDemandeClotureCoproprietaire(m.get("dateDemandeCloture") != null);

        // Kanban
        dto.setDansUnKanban(mapKanban.containsKey(id) ? mapKanban.get(id) : "0");

        // Dernier comm pas D4
        dto.setDernierCommPasD4(idsCommPasD4.contains(id));

        // Type
        String dtype = m.get("dtype") != null ? (String) m.get("dtype") : "";
        dto.setSinistre("Sinistre".equals(dtype));
        dto.setProcedure("Procedure".equals(dtype) || Boolean.TRUE.equals(m.get("procedure")));

        // Numero
        dto.setNumero(m.get("numero") != null ? m.get("numero").toString() : "-");

        // Urgence
        dto.setUrgence("URGENT".equals(m.get("urgenceStr")));

        // Suivi CS / AG
        dto.setSuiviCS(Boolean.TRUE.equals(m.get("suiviCS")));
        dto.setAg(Boolean.TRUE.equals(m.get("ag")));

        // Visibilité : 0=coproprietaires, 1=CS, 2=privé
        boolean visCopro = Boolean.TRUE.equals(m.get("visibleParCoproprietaires"));
        boolean visCS = Boolean.TRUE.equals(m.get("visibleParLeCS"));
        dto.setVisibilite(visCopro ? 0 : (visCS ? 1 : 2));

        return dto;
    }

    /**
     * Parse une valeur notBefore (java.sql.Date ou LocalDate) en NotBeforeDTO.
     */
    private NotBeforeDTO parseNotBefore(Object notBefore) {
        NotBeforeDTO nb = new NotBeforeDTO();
        try {
            LocalDate nbDate;
            if (notBefore instanceof java.sql.Date) {
                nbDate = ((java.sql.Date) notBefore).toLocalDate();
            } else if (notBefore instanceof LocalDate) {
                nbDate = (LocalDate) notBefore;
            } else {
                return null;
            }
            nb.setAVenir(LocalDate.now().isBefore(nbDate));
            nb.setDate(nbDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            return nb;
        } catch (Exception e) {
            return null;
        }
    }
}
