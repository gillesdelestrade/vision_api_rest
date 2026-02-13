package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.DetailDemandeDTO;
import fr.d4immobilier.visionapirest.dto.DetailDemandeDTO.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Stateless
public class DetailDemandeService {

    @PersistenceContext
    private EntityManager em;

    private static final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final String[] COULEURS_KANBAN = {"#0000FF", "#00FF00", "#FFFF00", "#FF0000"};
    private static final String[] URGENCES = {"DANS_LES_10_JOURS", "URGENT"};
    private static final String[] IMPORTANCES = {"MINEUR", "SERIEUX", "IMPORTANT", "CRITIQUE"};

    /**
     * Point d'entrée : récupère le détail complet d'une demande.
     * Reproduit la logique de DetailDemandeJSON.processRequest()
     * 
     * @param demandeId  ID de la demande
     * @param currentUserId  ID du user connecté (pour permissions + typePersonne)
     */
    public DetailDemandeDTO getDetailDemande(Long demandeId, Long currentUserId) {

        // 1. Charger la demande principale
        Map<String, Object> demande = loadDemande(demandeId);
        if (demande == null) return null;

        Long coproprieteId = (Long) demande.get("coproprieteId");
        Long emetteurId = demande.get("emetteurId") != null ? (Long) demande.get("emetteurId") : null;

        // 2. Charger les données liées
        PersonneRefDTO attributaire = loadAttributaire(demandeId);
        PersonneRefDTO emetteur = loadEmetteur(demandeId);
        EquipementRefDTO equipement = loadEquipement(demandeId);
        List<ActionDemandeDTO> actions = loadActions(demandeId);
        List<InterventionDemandeDTO> interventions = loadInterventions(demandeId);
        List<EtiquetteDTO> etiquettes = loadEtiquettes(demandeId);

        // 3. Historique : événements + fichiers fusionnés et triés desc
        List<ElementHistoriqueDTO> historique = buildHistorique(demandeId, emetteurId);

        // 4. Kanban
        EtatKanbanDTO etatKanbanEnCours = null;
        List<EtatKanbanDTO> etatsKanban = null;
        Map<String, Object> kanbanInfo = loadKanbanEnCours(demandeId);
        if (kanbanInfo != null) {
            etatKanbanEnCours = new EtatKanbanDTO();
            etatKanbanEnCours.setId((Long) kanbanInfo.get("etatKanbanId"));
            etatKanbanEnCours.setLibelle((String) kanbanInfo.get("etatKanbanLibelle"));
            Long kanbanId = (Long) kanbanInfo.get("kanbanId");
            etatsKanban = loadEtatsKanban(kanbanId);
        }

        // 5. Permissions
        boolean estAuCS = estAuConseilSyndical(currentUserId, coproprieteId);
        boolean estEmetteur = currentUserId != null && currentUserId.equals(emetteurId);

        // 6. Assembler le DTO
        DetailDemandeDTO dto = new DetailDemandeDTO();
        dto.setId(demandeId);
        dto.setDescription(demande.get("description") != null ? (String) demande.get("description") : "");
        dto.setDateConstat(formatInstant(demande.get("dateConstat")));

        // Copropriété
        CoproprieteRefDTO coproDto = new CoproprieteRefDTO();
        coproDto.setId(coproprieteId);
        coproDto.setTrigramme((String) demande.get("trigramme"));
        coproDto.setNom((String) demande.get("coproNom"));
        dto.setCopropriete(coproDto);

        dto.setAttributaire(attributaire);
        dto.setEmetteur(emetteur);
        dto.setEquipement(equipement);

        // Bâtiment (via équipement)
        if (equipement != null && equipement.getId() != null) {
            BatimentRefDTO bat = loadBatimentFromEquipement(demandeId);
            dto.setBatiment(bat);
        }

        dto.setActions(actions);
        dto.setElementsHistorique(historique);
        dto.setDemandesIntervention(interventions);
        dto.setEtiquettes(etiquettes);
        dto.setEtatKanbanEnCours(etatKanbanEnCours);
        dto.setEtatsKanban(etatsKanban);

        // Confidentialité
        boolean visCopro = Boolean.TRUE.equals(demande.get("visibleParCoproprietaires"));
        boolean visCS = Boolean.TRUE.equals(demande.get("visibleParLeCS"));
        dto.setNiveauConfidentialite(visCopro ? 0 : (visCS ? 1 : 2));

        // Urgence, SuiviCS, A Surveiller
        int urgIdx = demande.get("urgence") != null ? ((Number) demande.get("urgence")).intValue() : 0;
        dto.setUrgent(urgIdx == 1);
        dto.setSuiviCS(Boolean.TRUE.equals(demande.get("suiviCS")));
        dto.setASurveiller(Boolean.TRUE.equals(demande.get("epingle")));

        // Permissions
        if (estAuCS) {
            dto.setPeutChangerSuiviCS(true);
            dto.setPeutChangerUrgence(true);
            dto.setPeutChangerASurveiller(true);
            dto.setPeutChangerConfidentialite(emetteurId == null || estEmetteur);
        } else if (estEmetteur) {
            dto.setPeutChangerSuiviCS(true);
            dto.setPeutChangerUrgence(true);
            dto.setPeutChangerConfidentialite(true);
            dto.setPeutChangerASurveiller(true);
        }

        return dto;
    }

    // ================================================================
    //  CHARGEMENT DES DONNÉES
    // ================================================================

    /**
     * Charge la demande principale avec ses champs essentiels.
     */
    @SuppressWarnings("unchecked")
    private Map<String, Object> loadDemande(Long demandeId) {
        String sql = "SELECT DEMANDE.ID, DEMANDE.DESCRIPTION, DEMANDE.DATECONSTAT, " +
            "COPROPRIETE.ID, COPROPRIETE.TRIGRAMME, COPROPRIETE.NOM, " +
            "DEMANDE.ATTRIBUTAIRE_ID, DEMANDE.EMETTEUR_ID, " +
            "DEMANDE.URGENCE, DEMANDE.SUIVICS, DEMANDE.EPINGLE, " +
            "DEMANDE.VISIBLEPARCOPROPRIETAIRES, DEMANDE.VISIBLEPARLECS, " +
            "COPROPRIETE.GESTIONNAIRE_ID " +
            "FROM DEMANDE INNER JOIN COPROPRIETE ON DEMANDE.COPROPRIETE_ID=COPROPRIETE.ID " +
            "WHERE DEMANDE.ID=" + demandeId;
        List<Object[]> rows = em.createNativeQuery(sql).getResultList();
        if (rows == null || rows.isEmpty()) return null;

        Object[] r = rows.get(0);
        Map<String, Object> m = new HashMap<>();
        m.put("id", r[0]);
        m.put("description", r[1]);
        m.put("dateConstat", r[2]);
        m.put("coproprieteId", r[3]);
        m.put("trigramme", r[4]);
        m.put("coproNom", r[5]);
        // Si pas d'attributaire, on utilise le gestionnaire de la copro
        m.put("attributaireId", r[6] != null ? r[6] : r[13]);
        m.put("emetteurId", r[7]);
        m.put("urgence", r[8]);
        m.put("suiviCS", r[9] != null && Boolean.TRUE.equals(r[9]));
        m.put("epingle", r[10] != null && Boolean.TRUE.equals(r[10]));
        m.put("visibleParCoproprietaires", r[11] != null && Boolean.TRUE.equals(r[11]));
        m.put("visibleParLeCS", r[12] != null && Boolean.TRUE.equals(r[12]));
        m.put("gestionnaireId", r[13]);
        return m;
    }

    /**
     * Reproduit PersonneDAO.getAttributaireLight(Demande)
     */
    @SuppressWarnings("unchecked")
    private PersonneRefDTO loadAttributaire(Long demandeId) {
        String sql = "SELECT PERSONNE.ID, PERSONNE.NOM, PERSONNE.PRENOM, MAIL1 " +
            "FROM PERSONNE INNER JOIN DEMANDE ON PERSONNE.ID=DEMANDE.ATTRIBUTAIRE_ID " +
            "WHERE DEMANDE.ID=" + demandeId;
        List<Object[]> rows = em.createNativeQuery(sql).getResultList();
        if (rows == null || rows.isEmpty()) {
            // Fallback : gestionnaire de la copro
            String sql2 = "SELECT P.ID, P.NOM, P.PRENOM, P.MAIL1 " +
                "FROM PERSONNE P INNER JOIN COPROPRIETE C ON P.ID=C.GESTIONNAIRE_ID " +
                "INNER JOIN DEMANDE D ON D.COPROPRIETE_ID=C.ID WHERE D.ID=" + demandeId;
            rows = em.createNativeQuery(sql2).getResultList();
            if (rows == null || rows.isEmpty()) return null;
        }
        return toPersonneRef(rows.get(0));
    }

    /**
     * Reproduit PersonneDAO.getEmetteurLight(Demande)
     */
    @SuppressWarnings("unchecked")
    private PersonneRefDTO loadEmetteur(Long demandeId) {
        String sql = "SELECT PERSONNE.ID, PERSONNE.NOM, PERSONNE.PRENOM, MAIL1 " +
            "FROM PERSONNE INNER JOIN DEMANDE ON PERSONNE.ID=DEMANDE.EMETTEUR_ID " +
            "WHERE DEMANDE.ID=" + demandeId;
        List<Object[]> rows = em.createNativeQuery(sql).getResultList();
        if (rows == null || rows.isEmpty()) return null;
        return toPersonneRef(rows.get(0));
    }

    /**
     * Reproduit EquipementDAO.getEquipement(Demande) avec TypeEquipement et Batiment
     */
    @SuppressWarnings("unchecked")
    private EquipementRefDTO loadEquipement(Long demandeId) {
        String sql = "SELECT EQUIPEMENT.ID, EQUIPEMENT.LIBELLE, " +
            "TYPEEQUIPEMENT.ID, TYPEEQUIPEMENT.TYPEEQUIPEMENT " +
            "FROM DEMANDE INNER JOIN (EQUIPEMENT INNER JOIN TYPEEQUIPEMENT " +
            "ON EQUIPEMENT.TYPEEQUIPEMENT_ID=TYPEEQUIPEMENT.ID) " +
            "ON DEMANDE.EQUIPEMENT_ID=EQUIPEMENT.ID WHERE DEMANDE.ID=" + demandeId;
        List<Object[]> rows = em.createNativeQuery(sql).getResultList();
        if (rows == null || rows.isEmpty()) return null;
        Object[] r = rows.get(0);
        EquipementRefDTO dto = new EquipementRefDTO();
        dto.setId((Long) r[0]);
        dto.setLibelle(r[1] != null ? (String) r[1] : "");
        dto.setTypeEquipement(r[3] != null ? (String) r[3] : "");
        return dto;
    }

    /**
     * Bâtiment via l'équipement de la demande
     */
    @SuppressWarnings("unchecked")
    private BatimentRefDTO loadBatimentFromEquipement(Long demandeId) {
        String sql = "SELECT BATIMENT.ID, BATIMENT.LIBELLE FROM DEMANDE " +
            "INNER JOIN EQUIPEMENT ON DEMANDE.EQUIPEMENT_ID=EQUIPEMENT.ID " +
            "INNER JOIN BATIMENT ON EQUIPEMENT.BATIMENT_ID=BATIMENT.ID " +
            "WHERE DEMANDE.ID=" + demandeId;
        List<Object[]> rows = em.createNativeQuery(sql).getResultList();
        if (rows == null || rows.isEmpty()) return null;
        Object[] r = rows.get(0);
        BatimentRefDTO dto = new BatimentRefDTO();
        dto.setId((Long) r[0]);
        dto.setLibelle(r[1] != null ? (String) r[1] : "");
        return dto;
    }

    /**
     * Reproduit ActionDAO.getActionsDemandeLight(Demande)
     */
    @SuppressWarnings("unchecked")
    private List<ActionDemandeDTO> loadActions(Long demandeId) {
        String sql = "SELECT ACTION.ID, ACTION.LIBELLE, ACTION.DATECREATION, " +
            "ACTION.DATEREALISATION, ACTION.DATEPREVUE, ACTION.IMPORTANCE, ACTION.URGENCE, " +
            "EMETTEUR.ID, EMETTEUR.NOM, EMETTEUR.PRENOM, " +
            "EXECUTEUR.ID, EXECUTEUR.NOM, EXECUTEUR.PRENOM " +
            "FROM (ACTION LEFT JOIN PERSONNE AS EMETTEUR ON EMETTEUR.ID=ACTION.EMETTEUR_ID) " +
            "LEFT JOIN PERSONNE AS EXECUTEUR ON EXECUTEUR.ID=ACTION.EXECUTEUR_ID " +
            "WHERE DEMANDE_ID=" + demandeId;
        List<ActionDemandeDTO> result = new ArrayList<>();
        for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
            ActionDemandeDTO dto = new ActionDemandeDTO();
            dto.setId((Long) r[0]);
            dto.setLibelle(r[1] != null ? (String) r[1] : "Nouvelle action");
            dto.setDateCreation(formatInstant(r[2]));
            dto.setDateRealisation(formatInstant(r[3]));
            dto.setDatePrevue(formatInstant(r[4]));
            if (r[5] != null) {
                int imp = ((Number) r[5]).intValue();
                dto.setImportance(imp >= 0 && imp < IMPORTANCES.length ? IMPORTANCES[imp] : "SERIEUX");
            } else {
                dto.setImportance("SERIEUX");
            }
            if (r[6] != null) {
                int urg = ((Number) r[6]).intValue();
                dto.setUrgence(urg >= 0 && urg < URGENCES.length ? URGENCES[urg] : "DANS_LES_10_JOURS");
            } else {
                dto.setUrgence("DANS_LES_10_JOURS");
            }
            if (r[7] != null) {
                PersonneRefDTO em = new PersonneRefDTO();
                em.setId((Long) r[7]);
                em.setNom(r[8] != null ? (String) r[8] : "");
                em.setPrenom(r[9] != null ? (String) r[9] : "");
                dto.setEmetteur(em);
            }
            if (r[10] != null) {
                PersonneRefDTO ex = new PersonneRefDTO();
                ex.setId((Long) r[10]);
                ex.setNom(r[11] != null ? (String) r[11] : "");
                ex.setPrenom(r[12] != null ? (String) r[12] : "");
                dto.setExecuteur(ex);
            }
            result.add(dto);
        }
        return result;
    }

    /**
     * Reproduit InterventionDemandeDAO.getInterventionDemandesLight(Demande)
     */
    @SuppressWarnings("unchecked")
    private List<InterventionDemandeDTO> loadInterventions(Long demandeId) {
        String sql = "SELECT INTERVENTIONDEMANDE.ID, DATEANNULATION, DATEINTERVENTIONREALISEE, " +
            "DATEPRISEENCOMPTEFOURNISSEUR, PLAGEINTERVENTIONPREVUE, DATERAPPEL, " +
            "SOCIETE.RAISONSOCIALE, DATECREATIONDEMANDE, OBJET, INTERVENTIONDEMANDE.REFERENCE, " +
            "FICHIER.ID, FICHIER.NOMSTOCKAGE, FICHIER.DATECREATION, FICHIER.NOMFICHIER, " +
            "FACTUREFOURNISSEUR.ID, FACTUREFOURNISSEUR.DATEFACTURE, FACTUREFOURNISSEUR.REFERENCE, " +
            "FACTUREFOURNISSEUR.MONTANT, FACTUREFOURNISSEUR.DATERECEPTION, " +
            "FICHIERFACTURE.ID, FICHIERFACTURE.NOMSTOCKAGE, FICHIERFACTURE.DATECREATION, FICHIERFACTURE.NOMFICHIER " +
            "FROM ((INTERVENTIONDEMANDE INNER JOIN SOCIETE ON INTERVENTIONDEMANDE.FOURNISSEUR_ID=SOCIETE.ID) " +
            "LEFT JOIN FICHIER ON INTERVENTIONDEMANDE.ID=FICHIER.INTERVENTIONDEMANDE_ID) " +
            "LEFT JOIN (FACTUREFOURNISSEUR INNER JOIN FICHIER AS FICHIERFACTURE " +
            "ON FACTUREFOURNISSEUR.ID=FICHIERFACTURE.FACTUREFOURNISSEUR_ID) " +
            "ON INTERVENTIONDEMANDE.FACTUREFOURNISSEUR_ID=FACTUREFOURNISSEUR.ID " +
            "WHERE INTERVENTIONDEMANDE.DEMANDE_ID=" + demandeId;

        List<InterventionDemandeDTO> result = new ArrayList<>();
        for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
            InterventionDemandeDTO dto = new InterventionDemandeDTO();
            dto.setId((Long) r[0]);
            dto.setDateAnnulation(formatLocalDate(r[1]));
            dto.setDateInterventionRealisee(formatLocalDate(r[2]));
            dto.setDatePriseEnCompte(formatInstant(r[3]));
            dto.setPlageInterventionPrevue(r[4] != null ? (String) r[4] : null);
            dto.setDateRappel(formatLocalDate(r[5]));
            dto.setFournisseur(r[6] != null ? (String) r[6] : "");
            dto.setDateCreation(formatInstant(r[7]));
            dto.setObjet(r[8] != null ? (String) r[8] : "");
            dto.setReference(r[9] != null ? (String) r[9] : "");

            if (r[10] != null) {
                FichierDTO f = new FichierDTO();
                f.setId((Long) r[10]);
                f.setNomStockage(r[11] != null ? (String) r[11] : "");
                f.setNomFichier(r[13] != null ? (String) r[13] : "");
                dto.setFichierDemande(f);
            }
            if (r[14] != null) {
                FactureDTO fac = new FactureDTO();
                fac.setId((Long) r[14]);
                fac.setDateFacture(formatLocalDate(r[15]));
                fac.setReference(r[16] != null ? (String) r[16] : "");
                if (r[17] != null) {
                    fac.setMontant(((Number) r[17]).floatValue());
                }
                fac.setDateReception(formatLocalDate(r[18]));
                fac.setFournisseur(r[6] != null ? (String) r[6] : "");
                if (r[19] != null) {
                    FichierDTO ff = new FichierDTO();
                    ff.setId((Long) r[19]);
                    ff.setNomStockage(r[20] != null ? (String) r[20] : "");
                    ff.setNomFichier(r[22] != null ? (String) r[22] : "");
                    fac.setFichier(ff);
                }
                dto.setFacture(fac);
            }
            result.add(dto);
        }
        return result;
    }

    /**
     * Reproduit EtiquetteDAO.getEtiquettes(Demande)
     */
    @SuppressWarnings("unchecked")
    private List<EtiquetteDTO> loadEtiquettes(Long demandeId) {
        String sql = "SELECT ETIQUETTE.ID, ETIQUETTE.LIBELLE " +
            "FROM ETIQUETTE INNER JOIN AFFECTATIONETIQUETTE ON AFFECTATIONETIQUETTE.ETIQUETTE_ID=ETIQUETTE.ID " +
            "WHERE AFFECTATIONETIQUETTE.IDOBJET=" + demandeId;
        List<EtiquetteDTO> result = new ArrayList<>();
        for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
            EtiquetteDTO dto = new EtiquetteDTO();
            dto.setId((Long) r[0]);
            dto.setLibelle(r[1] != null ? (String) r[1] : "");
            result.add(dto);
        }
        return result;
    }

    // ================================================================
    //  HISTORIQUE (événements + fichiers fusionnés)
    // ================================================================

    /**
     * Construit l'historique fusionné : événements + fichiers, trié desc par date.
     * Reproduit la logique de la servlet (EventementDemande + FichierDemande)
     */
    @SuppressWarnings("unchecked")
    private List<ElementHistoriqueDTO> buildHistorique(Long demandeId, Long emetteurId) {
        List<ElementHistoriqueDTO> elements = new ArrayList<>();

        // 1. Événements (reproduit EvenementDemandeDAO.getEvenementsDemandeLight)
        String sqlEv = "SELECT EVENEMENTDEMANDE.ID, EVENEMENTDEMANDE.DATEEVENEMENT, " +
            "EVENEMENTDEMANDE.TEXTE, PERSONNE.ID, PERSONNE.NOM, PERSONNE.PRENOM, " +
            "PERSONNE.DTYPE, SOCIETE.DTYPE, SOCIETE.RAISONSOCIALE, " +
            "EVENEMENTDEMANDE.IDDI, EVENEMENTDEMANDE.IDDDF " +
            "FROM EVENEMENTDEMANDE " +
            "INNER JOIN (PERSONNE LEFT JOIN SOCIETE ON SOCIETE.REPRESENTANT_ID=PERSONNE.ID) " +
            "ON EVENEMENTDEMANDE.AUTEUR_ID=PERSONNE.ID " +
            "WHERE (EVENEMENTDEMANDE.ALACORBEILLE IS NULL OR EVENEMENTDEMANDE.ALACORBEILLE='0') " +
            "AND EVENEMENTDEMANDE.DEMANDE_ID=" + demandeId;

        for (Object[] r : (List<Object[]>) em.createNativeQuery(sqlEv).getResultList()) {
            ElementHistoriqueDTO eh = new ElementHistoriqueDTO();
            eh.setId((Long) r[0]);
            eh.setDate(formatInstant(r[1]));
            eh.setTexte(r[2] != null ? (String) r[2] : "");

            // Auteur
            PersonneRefDTO auteur = new PersonneRefDTO();
            auteur.setId((Long) r[3]);
            // Si fournisseur, utiliser raison sociale
            if ("Fournisseur".equals(r[7]) && r[8] != null) {
                auteur.setNom((String) r[8]);
                auteur.setPrenom("");
            } else {
                auteur.setNom(r[4] != null ? (String) r[4] : "");
                auteur.setPrenom(r[5] != null ? (String) r[5] : "");
            }
            eh.setAuteur(auteur);

            // TypePersonne : 0=gestionnaire, 1=emetteur, 2=autre
            String dtype = r[6] != null ? (String) r[6] : "";
            if ("Gestionnaire".equalsIgnoreCase(dtype)) {
                eh.setTypePersonne(0);
            } else if (auteur.getId() != null && auteur.getId().equals(emetteurId)) {
                eh.setTypePersonne(1);
            } else {
                eh.setTypePersonne(2);
            }

            if (r[9] != null) eh.setIdDI((Long) r[9]);
            if (r[10] != null) eh.setIdDDF((Long) r[10]);

            elements.add(eh);
        }

        // 2. Fichiers (reproduit FichierDAO.getFichiersDemandesLight)
        String sqlFi = "SELECT FICHIER.ID, FICHIER.NOMSTOCKAGE, FICHIER.NOMFICHIER, " +
            "FICHIER.DATECREATION, PERSONNE.ID, PERSONNE.NOM, PERSONNE.PRENOM, " +
            "PERSONNE.DTYPE, SOCIETE.DTYPE, SOCIETE.RAISONSOCIALE " +
            "FROM FICHIER " +
            "INNER JOIN (PERSONNE LEFT JOIN SOCIETE ON PERSONNE.ID=SOCIETE.REPRESENTANT_ID) " +
            "ON FICHIER.AUTEUR_ID=PERSONNE.ID " +
            "WHERE FICHIER.DEMANDE_ID=" + demandeId +
            " AND (FICHIER.ALACORBEILLE IS NULL OR FICHIER.ALACORBEILLE='0')";

        for (Object[] r : (List<Object[]>) em.createNativeQuery(sqlFi).getResultList()) {
            ElementHistoriqueDTO eh = new ElementHistoriqueDTO();
            eh.setId((Long) r[0]);
            eh.setDate(formatInstant(r[3]));
            eh.setTexte(null); // fichiers n'ont pas de texte

            // Fichier
            FichierDTO f = new FichierDTO();
            f.setId((Long) r[0]);
            f.setNomStockage(r[1] != null ? (String) r[1] : "");
            f.setNomFichier(r[2] != null ? (String) r[2] : "");
            f.setMiniature(buildMiniatureType(r[1] != null ? (String) r[1] : ""));
            eh.setFichier(f);

            // Auteur
            PersonneRefDTO auteur = new PersonneRefDTO();
            auteur.setId((Long) r[4]);
            if ("Fournisseur".equals(r[8]) && r[9] != null) {
                auteur.setNom((String) r[9]);
                auteur.setPrenom("");
            } else {
                auteur.setNom(r[5] != null ? (String) r[5] : "");
                auteur.setPrenom(r[6] != null ? (String) r[6] : "");
            }
            eh.setAuteur(auteur);

            String dtype = r[7] != null ? (String) r[7] : "";
            if ("Gestionnaire".equalsIgnoreCase(dtype)) {
                eh.setTypePersonne(0);
            } else if (auteur.getId() != null && auteur.getId().equals(emetteurId)) {
                eh.setTypePersonne(1);
            } else {
                eh.setTypePersonne(2);
            }

            elements.add(eh);
        }

        // 2b. Fichiers via devis fournisseur (2ème requête de getFichiersDemandesLight)
        String sqlFiDevis = "SELECT FICHIER.ID, FICHIER.NOMSTOCKAGE, FICHIER.NOMFICHIER, " +
            "FICHIER.DATECREATION, PERSONNE.ID, PERSONNE.NOM, PERSONNE.PRENOM " +
            "FROM (((FICHIER INNER JOIN PERSONNE ON FICHIER.AUTEUR_ID=PERSONNE.ID) " +
            "INNER JOIN DEVISFOURNISSEUR ON FICHIER.DEVISFOURNISSEUR_ID=DEVISFOURNISSEUR.ID) " +
            "INNER JOIN DEMANDEDEVISFOURNISSEUR ON DEVISFOURNISSEUR.DEMANDEDEVISFOURNISSEUR_ID=DEMANDEDEVISFOURNISSEUR.ID) " +
            "INNER JOIN DEMANDEDEVIS ON DEMANDEDEVISFOURNISSEUR.DEMANDEDEVIS_ID=DEMANDEDEVIS.ID " +
            "WHERE DEMANDEDEVIS.DEMANDE_ID=" + demandeId;

        try {
            for (Object[] r : (List<Object[]>) em.createNativeQuery(sqlFiDevis).getResultList()) {
                ElementHistoriqueDTO eh = new ElementHistoriqueDTO();
                eh.setId((Long) r[0]);
                eh.setDate(formatInstant(r[3]));
                eh.setTexte(null);

                FichierDTO f = new FichierDTO();
                f.setId((Long) r[0]);
                f.setNomStockage(r[1] != null ? (String) r[1] : "");
                f.setNomFichier(r[2] != null ? (String) r[2] : "");
                f.setMiniature(buildMiniatureType(r[1] != null ? (String) r[1] : ""));
                eh.setFichier(f);

                PersonneRefDTO auteur = new PersonneRefDTO();
                auteur.setId((Long) r[4]);
                auteur.setNom(r[5] != null ? (String) r[5] : "");
                auteur.setPrenom(r[6] != null ? (String) r[6] : "");
                eh.setAuteur(auteur);
                eh.setTypePersonne(0); // fichiers devis = gestionnaire
                elements.add(eh);
            }
        } catch (Exception e) {
            // tables de devis peuvent ne pas exister
        }

        // 3. Trier par date desc (Collections.reverseOrder comme la servlet)
        elements.sort((a, b) -> {
            if (a.getDate() == null && b.getDate() == null) return 0;
            if (a.getDate() == null) return 1;
            if (b.getDate() == null) return -1;
            return b.getDate().compareTo(a.getDate());
        });

        return elements;
    }

    // ================================================================
    //  KANBAN
    // ================================================================

    /**
     * Reproduit JournalEtatKanbanDAO.getJournalEtatKanbanEnCours(Demande)
     */
    @SuppressWarnings("unchecked")
    private Map<String, Object> loadKanbanEnCours(Long demandeId) {
        String sql = "SELECT ETATKANBAN.ID, ETATKANBAN.LIBELLE, " +
            "JOURNALETATKANBAN.ID, JOURNALETATKANBAN.DATEEXPIRATION, " +
            "KANBAN.ID, KANBAN.TITRE " +
            "FROM DEMANDE INNER JOIN (JOURNALETATKANBAN " +
            "INNER JOIN (ETATKANBAN INNER JOIN KANBAN ON ETATKANBAN.KANBAN_ID=KANBAN.ID) " +
            "ON JOURNALETATKANBAN.ETATKANBAN_ID=ETATKANBAN.ID) " +
            "ON DEMANDE.ID=JOURNALETATKANBAN.DEMANDE_ID " +
            "WHERE JOURNALETATKANBAN.DATESORTIE IS NULL AND DEMANDE.ID=" + demandeId;
        try {
            List<Object[]> rows = em.createNativeQuery(sql).getResultList();
            if (rows == null || rows.isEmpty()) return null;
            Object[] r = rows.get(0);
            Map<String, Object> m = new HashMap<>();
            m.put("etatKanbanId", r[0]);
            m.put("etatKanbanLibelle", r[1]);
            m.put("kanbanId", r[4]);
            return m;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Reproduit EtatKanbanDAO.getEtatsKanban(Kanban)
     */
    @SuppressWarnings("unchecked")
    private List<EtatKanbanDTO> loadEtatsKanban(Long kanbanId) {
        String sql = "SELECT ID, DATAFIELD, LIBELLE, NUMEROORDRE, COULEURETATKANBAN " +
            "FROM ETATKANBAN WHERE KANBAN_ID=" + kanbanId + " ORDER BY NUMEROORDRE ASC";
        List<EtatKanbanDTO> result = new ArrayList<>();
        for (Object[] r : (List<Object[]>) em.createNativeQuery(sql).getResultList()) {
            EtatKanbanDTO dto = new EtatKanbanDTO();
            dto.setId((Long) r[0]);
            dto.setDataField(r[1] != null ? (String) r[1] : "");
            dto.setLibelle(r[2] != null ? (String) r[2] : "");
            dto.setNumeroOrdre(r[3] != null ? ((Number) r[3]).intValue() : 0);
            if (r[4] != null) {
                int idx = ((Number) r[4]).intValue();
                dto.setCouleur(idx >= 0 && idx < COULEURS_KANBAN.length ? COULEURS_KANBAN[idx] : null);
            }
            result.add(dto);
        }
        return result;
    }

    // ================================================================
    //  CONSEIL SYNDICAL
    // ================================================================

    /**
     * Reproduit ConseilSyndicalDAO.estAuConseilSyndical(Personne, Copropriete)
     * Vérifie si l'utilisateur est président ou membre du CS
     */
    @SuppressWarnings("unchecked")
    private boolean estAuConseilSyndical(Long personneId, Long coproprieteId) {
        if (personneId == null || coproprieteId == null) return false;
        try {
            // Président personne
            String sql1 = "SELECT ID FROM CONSEILSYNDICAL WHERE PRESIDENT_ID=" + personneId + " AND COPROPRIETE_ID=" + coproprieteId;
            if (!em.createNativeQuery(sql1).getResultList().isEmpty()) return true;

            // Président société (représentant)
            String sql2 = "SELECT CONSEILSYNDICAL.ID FROM CONSEILSYNDICAL INNER JOIN SOCIETE ON CONSEILSYNDICAL.PRESIDENTSOCIETE_ID=SOCIETE.ID WHERE SOCIETE.REPRESENTANT_ID=" + personneId + " AND COPROPRIETE_ID=" + coproprieteId;
            if (!em.createNativeQuery(sql2).getResultList().isEmpty()) return true;

            // Membre personne
            String sql3 = "SELECT CONSEILSYNDICAL.ID FROM CONSEILSYNDICAL_PERSONNE INNER JOIN CONSEILSYNDICAL ON CONSEILSYNDICAL_PERSONNE.conseilsSyndicaux_ID=CONSEILSYNDICAL.ID WHERE membres_ID=" + personneId + " AND COPROPRIETE_ID=" + coproprieteId;
            if (!em.createNativeQuery(sql3).getResultList().isEmpty()) return true;

            // Membre société (représentant)
            String sql4 = "SELECT CONSEILSYNDICAL.ID FROM (CONSEILSYNDICAL_SOCIETE INNER JOIN CONSEILSYNDICAL ON CONSEILSYNDICAL_SOCIETE.conseilsSyndicaux_ID=CONSEILSYNDICAL.ID) INNER JOIN SOCIETE ON CONSEILSYNDICAL_SOCIETE.membresSocietes_ID=SOCIETE.ID WHERE REPRESENTANT_ID=" + personneId + " AND COPROPRIETE_ID=" + coproprieteId;
            if (!em.createNativeQuery(sql4).getResultList().isEmpty()) return true;
        } catch (Exception e) {
            // ignore
        }
        return false;
    }

    // ================================================================
    //  UTILITAIRES
    // ================================================================

    private PersonneRefDTO toPersonneRef(Object[] r) {
        PersonneRefDTO dto = new PersonneRefDTO();
        dto.setId((Long) r[0]);
        dto.setNom(r[1] != null ? (String) r[1] : "");
        dto.setPrenom(r[2] != null ? (String) r[2] : "");
        dto.setMail(r[3] != null ? (String) r[3] : "");
        return dto;
    }

    private String formatInstant(Object val) {
        if (val == null) return null;
        try {
            if (val instanceof Instant) {
                return ((Instant) val).atZone(ZoneId.systemDefault()).format(FMT_DATE);
            } else if (val instanceof java.sql.Timestamp) {
                return ((java.sql.Timestamp) val).toInstant().atZone(ZoneId.systemDefault()).format(FMT_DATE);
            } else if (val instanceof java.sql.Date) {
                return ((java.sql.Date) val).toLocalDate().format(FMT_DATE);
            } else if (val instanceof LocalDate) {
                return ((LocalDate) val).format(FMT_DATE);
            }
        } catch (Exception e) {
            // fallback
        }
        return val.toString();
    }

    private String formatLocalDate(Object val) {
        if (val == null) return null;
        try {
            if (val instanceof LocalDate) {
                return ((LocalDate) val).format(FMT_DATE);
            } else if (val instanceof java.sql.Date) {
                return ((java.sql.Date) val).toLocalDate().format(FMT_DATE);
            } else if (val instanceof Instant) {
                return ((Instant) val).atZone(ZoneId.systemDefault()).format(FMT_DATE);
            }
        } catch (Exception e) {
            // fallback
        }
        return val.toString();
    }

    /**
     * Détermine le type de miniature selon l'extension du fichier.
     * Reproduit la logique de la servlet pour typer les fichiers.
     */
    private String buildMiniatureType(String nomStockage) {
        if (nomStockage == null) return null;
        String lower = nomStockage.toLowerCase();
        if (lower.endsWith("jpg") || lower.endsWith("jpeg") || lower.endsWith("png")) {
            return "IMAGE";
        } else if (lower.endsWith("pdf")) {
            return "PDF";
        } else if (lower.endsWith("doc") || lower.endsWith("docx")) {
            return "WORD";
        } else if (lower.endsWith("xls") || lower.endsWith("xlsx")) {
            return "EXCEL";
        } else if (lower.endsWith("ppt") || lower.endsWith("pptx")) {
            return "POWERPOINT";
        } else if (lower.endsWith("zip")) {
            return "ZIP";
        } else if (lower.endsWith("rar")) {
            return "RAR";
        } else if (lower.endsWith("avi") || lower.endsWith("mpg") || lower.endsWith("mpeg") || lower.endsWith("mov")) {
            return "VIDEO";
        }
        return "OTHER";
    }
}
