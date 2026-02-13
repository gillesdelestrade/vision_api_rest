// FactureService.java
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.*;

@Stateless
public class FactureService {

    @PersistenceContext
    private EntityManager em;

    // ── Factures à viser (groupées par bâtiment) ──
    public List<BatimentFacturesDTO> findFacturesAViser(Long coproprieteId) {
        // avisD4 IN (1=validee, 2=consulter_le_cs) ET avisCS = 0 (en_attente) ET datePaiement NULL
        @SuppressWarnings("unchecked")
        List<Object[]> rows = em.createNativeQuery("""
            SELECT ff.id, ff.reference, ff.montant, ff.dateFacture, ff.dateReception,
                   ff.avisD4, ff.avisCS,
                   f.id AS fournisseur_id, f.raisonSociale,
                   fic.nomStockage
            FROM FactureFournisseur ff
            JOIN Societe f ON ff.fournisseur_id = f.id
            LEFT JOIN Fichier fic ON fic.factureFournisseur_id = ff.id
            WHERE ff.copropriete_id = :coproprieteId
              AND ff.dateDeMiseAuPaiement IS NULL
              AND ff.avisD4 IN (1, 2)
              AND ff.avisCS = 0
            ORDER BY ff.dateFacture DESC
            """)
                .setParameter("coproprieteId", coproprieteId)
                .getResultList();

        return groupByBatiment(rows, coproprieteId);
    }

    // ── Factures visées à payer (groupées par bâtiment) ──
    public List<BatimentFacturesDTO> findFacturesVisees(Long coproprieteId) {
        // avisD4 IN (1,2) ET avisCS IN (1=acceptee, 3=pas_necessaire) ET datePaiement NULL
        @SuppressWarnings("unchecked")
        List<Object[]> rows = em.createNativeQuery("""
            SELECT ff.id, ff.reference, ff.montant, ff.dateFacture, ff.dateReception,
                   ff.avisD4, ff.avisCS,
                   f.id AS fournisseur_id, f.raisonSociale,
                   fic.nomStockage
            FROM FactureFournisseur ff
            JOIN Societe f ON ff.fournisseur_id = f.id
            LEFT JOIN Fichier fic ON fic.factureFournisseur_id = ff.id
            WHERE ff.copropriete_id = :coproprieteId
              AND ff.dateDeMiseAuPaiement IS NULL
              AND ff.avisD4 IN (1, 2)
              AND ff.avisCS IN (1, 3)
            ORDER BY ff.dateFacture DESC
            """)
                .setParameter("coproprieteId", coproprieteId)
                .getResultList();

        return groupByBatiment(rows, coproprieteId);
    }

    // ── Factures payées (groupées par année puis fournisseur) ──
    public List<AnneeFacturesDTO> findFacturesPayees(Long coproprieteId) {
        @SuppressWarnings("unchecked")
        List<Object[]> rows = em.createNativeQuery("""
            SELECT ff.id, ff.reference, ff.montant, ff.dateFacture, ff.dateReception,
                   ff.dateDeMiseAuPaiement, ff.avisD4, ff.avisCS,
                   f.id AS fournisseur_id, f.raisonSociale,
                   fic.nomStockage
            FROM FactureFournisseur ff
            JOIN Societe f ON ff.fournisseur_id = f.id
            LEFT JOIN Fichier fic ON fic.factureFournisseur_id = ff.id
            WHERE ff.copropriete_id = :coproprieteId
              AND ff.dateDeMiseAuPaiement IS NOT NULL
            ORDER BY ff.dateFacture DESC
            """)
                .setParameter("coproprieteId", coproprieteId)
                .getResultList();

        return groupByAnneeFournisseur(rows);
    }

    // ── Factures rejetées (groupées par année puis fournisseur) ──
    public List<AnneeFacturesDTO> findFacturesRejetees(Long coproprieteId) {
        // (avisCS=0 ET avisD4=3) OU (avisCS=2 ET avisD4 IN (1,2))  ET datePaiement NULL
        @SuppressWarnings("unchecked")
        List<Object[]> rows = em.createNativeQuery("""
            SELECT ff.id, ff.reference, ff.montant, ff.dateFacture, ff.dateReception,
                   ff.dateDeMiseAuPaiement, ff.avisD4, ff.avisCS,
                   f.id AS fournisseur_id, f.raisonSociale,
                   fic.nomStockage
            FROM FactureFournisseur ff
            JOIN Societe f ON ff.fournisseur_id = f.id
            LEFT JOIN Fichier fic ON fic.factureFournisseur_id = ff.id
            WHERE ff.copropriete_id = :coproprieteId
              AND ff.dateDeMiseAuPaiement IS NULL
              AND (
                  (ff.avisCS = 0 AND ff.avisD4 = 3)
                  OR (ff.avisCS = 2 AND ff.avisD4 IN (1, 2))
              )
            ORDER BY ff.dateFacture DESC
            """)
                .setParameter("coproprieteId", coproprieteId)
                .getResultList();

        return groupByAnneeFournisseur(rows);
    }

    // ── Méthodes de groupement communes ──
    private List<BatimentFacturesDTO> groupByBatiment(List<Object[]> rows, Long coproprieteId) {
    if (rows.isEmpty()) return List.of();

    List<Long> factureIds = rows.stream()
        .map(r -> ((Number) r[0]).longValue())
        .toList();

    // Bâtiments (inchangé)
    @SuppressWarnings("unchecked")
    List<Object[]> batRows = em.createNativeQuery("""
        SELECT DISTINCT id_inter.factureFournisseur_id,
               b.id AS batiment_id, b.libelle
        FROM InterventionDemande id_inter
        JOIN Demande d ON id_inter.demande_id = d.id
        JOIN Equipement e ON d.equipement_id = e.id
        JOIN Batiment b ON e.batiment_id = b.id
        WHERE id_inter.factureFournisseur_id IN (:factureIds)
        """)
        .setParameter("factureIds", factureIds)
        .getResultList();

    var batimentParFacture = new HashMap<Long, Long>();
    var batimentNoms = new HashMap<Long, String>();
    batimentNoms.put(-1L, "Général");
    for (Object[] br : batRows) {
        Long factureId = ((Number) br[0]).longValue();
        Long batimentId = ((Number) br[1]).longValue();
        String libelle = (String) br[2];
        if (!batimentParFacture.containsKey(factureId)) {
            batimentParFacture.put(factureId, batimentId);
            batimentNoms.put(batimentId, libelle);
        }
    }

    var commentairesMap = loadCommentaires(factureIds);
    var interventionsMap = loadInterventions(factureIds);
    var contratsMap = loadContrats(factureIds);

    var parBatiment = new LinkedHashMap<Long, List<FactureDTO>>();
    parBatiment.put(-1L, new ArrayList<>());

    for (Object[] row : rows) {
        Long factureId = ((Number) row[0]).longValue();
        FactureDTO dto = toFactureDTO(row, false,
            commentairesMap.getOrDefault(factureId, List.of()),
            interventionsMap.getOrDefault(factureId, List.of()),
            contratsMap.get(factureId));
        Long batId = batimentParFacture.getOrDefault(factureId, -1L);
        parBatiment.computeIfAbsent(batId, k -> new ArrayList<>()).add(dto);
    }

    List<BatimentFacturesDTO> result = new ArrayList<>();
    if (!parBatiment.get(-1L).isEmpty()) {
        result.add(new BatimentFacturesDTO(-1L, "Général", parBatiment.get(-1L)));
    }
    for (Map.Entry<Long, List<FactureDTO>> entry : parBatiment.entrySet()) {
        if (entry.getKey() == -1L || entry.getValue().isEmpty()) continue;
        result.add(new BatimentFacturesDTO(entry.getKey(),
            batimentNoms.getOrDefault(entry.getKey(), "Bâtiment " + entry.getKey()),
            entry.getValue()));
    }
    return result;
}

    private List<AnneeFacturesDTO> groupByAnneeFournisseur(List<Object[]> rows) {
    if (rows.isEmpty()) return List.of();

    List<Long> factureIds = rows.stream()
        .map(r -> ((Number) r[0]).longValue())
        .toList();

    var commentairesMap = loadCommentaires(factureIds);
    var interventionsMap = loadInterventions(factureIds);
    var contratsMap = loadContrats(factureIds);

    var parAnneeFournisseur = new TreeMap<Integer, Map<Long, List<FactureDTO>>>(Comparator.reverseOrder());
    var fournisseurNoms = new HashMap<Long, String>();

    for (Object[] row : rows) {
        Long factureId = ((Number) row[0]).longValue();
        FactureDTO dto = toFactureDTO(row, true,
            commentairesMap.getOrDefault(factureId, List.of()),
            interventionsMap.getOrDefault(factureId, List.of()),
            contratsMap.get(factureId));
        Long fournisseurId = ((Number) row[8]).longValue();
        String raisonSociale = (String) row[9];
        fournisseurNoms.put(fournisseurId, raisonSociale);

        java.time.LocalDate dateFacture = row[3] != null ? ((java.sql.Date) row[3]).toLocalDate() : null;
        Integer annee = dateFacture != null ? dateFacture.getYear() : 0;

        parAnneeFournisseur
            .computeIfAbsent(annee, k -> new LinkedHashMap<>())
            .computeIfAbsent(fournisseurId, k -> new ArrayList<>())
            .add(dto);
    }

    List<AnneeFacturesDTO> result = new ArrayList<>();
    for (Map.Entry<Integer, Map<Long, List<FactureDTO>>> anneeEntry : parAnneeFournisseur.entrySet()) {
        List<FournisseurFacturesDTO> fournisseurs = new ArrayList<>();
        for (Map.Entry<Long, List<FactureDTO>> fEntry : anneeEntry.getValue().entrySet()) {
            fournisseurs.add(new FournisseurFacturesDTO(fEntry.getKey(),
                fournisseurNoms.getOrDefault(fEntry.getKey(), "Inconnu"), fEntry.getValue()));
        }
        fournisseurs.sort(Comparator.comparing(FournisseurFacturesDTO::fournisseurNom, String.CASE_INSENSITIVE_ORDER));
        result.add(new AnneeFacturesDTO(anneeEntry.getKey(), fournisseurs));
    }
    return result;
}

    // ── Mapping row → DTO ──
    private FactureDTO toFactureDTO(Object[] row, boolean hasDatePaiement,
        List<CommentaireFactureDTO> commentaires,
        List<InterventionDemandeFactureDTO> interventions,
        ContratFactureDTO contrat) {
    int idx = 0;
    Long id = ((Number) row[idx++]).longValue();
    String reference = (String) row[idx++];
    Float montant = row[idx] != null ? ((Number) row[idx]).floatValue() : null; idx++;
    java.time.LocalDate dateFacture = row[idx] != null ? ((java.sql.Date) row[idx]).toLocalDate() : null; idx++;
    java.time.LocalDate dateReception = row[idx] != null ? ((java.sql.Date) row[idx]).toLocalDate() : null; idx++;

    java.time.LocalDate datePaiement = null;
    if (hasDatePaiement) {
        datePaiement = row[idx] != null ? ((java.sql.Date) row[idx]).toLocalDate() : null;
        idx++;
    }

    Integer avisD4Ord = row[idx] != null ? ((Number) row[idx]).intValue() : null; idx++;
    Integer avisCSord = row[idx] != null ? ((Number) row[idx]).intValue() : null; idx++;
    Long fournisseurId = ((Number) row[idx++]).longValue();
    String raisonSociale = (String) row[idx++];
    String nomStockage = (String) row[idx];

    return new FactureDTO(id, reference, montant, dateFacture, dateReception,
        datePaiement,
        avisD4Ord != null ? avisD4ToString(avisD4Ord) : null,
        avisCSord != null ? avisCSToString(avisCSord) : null,
        new FournisseurSimpleDTO(fournisseurId, raisonSociale),
        nomStockage, commentaires, interventions, contrat);
}

    private String avisD4ToString(int ordinal) {
        return switch (ordinal) {
            case 0 ->
                "en_attente";
            case 1 ->
                "validee";
            case 2 ->
                "consulter_le_cs";
            case 3 ->
                "bloquee";
            case 4 ->
                "fichier_illisible";
            default ->
                "inconnu";
        };
    }

    private String avisCSToString(int ordinal) {
        return switch (ordinal) {
            case 0 ->
                "en_attente";
            case 1 ->
                "acceptee";
            case 2 ->
                "refusee";
            case 3 ->
                "pas_necessaire";
            default ->
                "inconnu";
        };
    }

    @SuppressWarnings("unchecked")
    private Map<Long, List<CommentaireFactureDTO>> loadCommentaires(List<Long> factureIds) {
        if (factureIds.isEmpty()) {
            return Map.of();
        }

        List<Object[]> comRows = em.createNativeQuery("""
        SELECT cff.factureFournisseur_id,
               cff.id,
               cff.commentaire,
               cff.dateCommentaire,
               p.prenom AS p_prenom,
               p.nom AS p_nom,
               s.raisonSociale
        FROM CommentaireFactureFournisseur cff
        LEFT JOIN Personne p ON cff.auteurPersonne_id = p.id
        LEFT JOIN Societe s ON cff.auteurSociete_id = s.id
        WHERE cff.factureFournisseur_id IN (:factureIds)
        ORDER BY cff.factureFournisseur_id, cff.dateCommentaire ASC
        """)
                .setParameter("factureIds", factureIds)
                .getResultList();

        var result = new java.util.HashMap<Long, List<CommentaireFactureDTO>>();
        for (Object[] row : comRows) {
            Long factureId = ((Number) row[0]).longValue();
            Long comId = ((Number) row[1]).longValue();
            String commentaire = (String) row[2];
            java.time.Instant dateCommentaire = row[3] != null ? (java.time.Instant) row[3] : null;
            String prenom = (String) row[4];
            String nom = (String) row[5];
            String raisonSociale = (String) row[6];

            String auteur;
            if (prenom != null || nom != null) {
                auteur = ((prenom != null ? prenom : "") + " " + (nom != null ? nom : "")).trim();
            } else if (raisonSociale != null) {
                auteur = raisonSociale;
            } else {
                auteur = null;
            }

            result.computeIfAbsent(factureId, k -> new java.util.ArrayList<>())
                    .add(new CommentaireFactureDTO(comId, commentaire, dateCommentaire, auteur));
        }
        return result;
    }

    // ── Interventions par facture ──
    @SuppressWarnings("unchecked")
private Map<Long, List<InterventionDemandeFactureDTO>> loadInterventions(List<Long> factureIds) {
    if (factureIds.isEmpty()) return Map.of();

    List<Object[]> rows = em.createNativeQuery("""
        SELECT id_inter.factureFournisseur_id,
               id_inter.id,
               id_inter.reference,
               id_inter.objet,
               id_inter.lieuIntervention,
               f_inter.nomStockage,
               df.id AS devis_id,
               df.reference AS devis_reference,
               df.dateDevis,
               df.montant AS devis_montant,
               f_devis.nomStockage AS devis_nomStockage
        FROM InterventionDemande id_inter
        LEFT JOIN Fichier f_inter ON f_inter.interventionDemande_id = id_inter.id
            AND f_inter.DTYPE = 'FichierInterventionDemande'
        LEFT JOIN DevisFournisseur df ON df.demandeIntervention_id = id_inter.id
        LEFT JOIN Fichier f_devis ON f_devis.devisFournisseur_id = df.id
            AND f_devis.DTYPE = 'FichierDevisFournisseur'
        WHERE id_inter.factureFournisseur_id IN (:factureIds)
        ORDER BY id_inter.factureFournisseur_id, id_inter.id
        """)
        .setParameter("factureIds", factureIds)
        .getResultList();

    var result = new HashMap<Long, List<InterventionDemandeFactureDTO>>();
    for (Object[] row : rows) {
        Long factureId = ((Number) row[0]).longValue();
        Long interId = ((Number) row[1]).longValue();
        String ref = (String) row[2];
        String objet = (String) row[3];
        String lieu = (String) row[4];
        String nomStockageInter = (String) row[5];

        DevisLieDTO devis = null;
        if (row[6] != null) {
            Long devisId = ((Number) row[6]).longValue();
            String devisRef = (String) row[7];
            java.time.LocalDate dateDevis = row[8] != null ? ((java.sql.Date) row[8]).toLocalDate() : null;
            Float devisMontant = row[9] != null ? ((Number) row[9]).floatValue() : null;
            String devisNomStockage = (String) row[10];
            devis = new DevisLieDTO(devisId, devisRef, dateDevis, devisMontant, devisNomStockage);
        }

        result.computeIfAbsent(factureId, k -> new ArrayList<>())
            .add(new InterventionDemandeFactureDTO(interId, ref, objet, lieu, nomStockageInter, devis));
    }
    return result;
}

// ── Contrats par facture + autres factures du même contrat ──
    @SuppressWarnings("unchecked")
    private Map<Long, ContratFactureDTO> loadContrats(List<Long> factureIds) {
        if (factureIds.isEmpty()) {
            return Map.of();
        }

        // 1) Récupérer les contrats rattachés aux factures
        List<Object[]> contratRows = em.createNativeQuery("""
        SELECT ff.id AS facture_id,
               cf.id AS contrat_id,
               cf.reference,
               cf.description
        FROM FactureFournisseur ff
        JOIN ContratFournisseur cf ON ff.contratFournisseur_id = cf.id
        WHERE ff.id IN (:factureIds)
        """)
                .setParameter("factureIds", factureIds)
                .getResultList();

        if (contratRows.isEmpty()) {
            return Map.of();
        }

        // Map factureId -> (contratId, ref, description)
        var factureContratMap = new HashMap<Long, Object[]>();
        var contratIds = new HashSet<Long>();
        for (Object[] row : contratRows) {
            Long factureId = ((Number) row[0]).longValue();
            Long contratId = ((Number) row[1]).longValue();
            factureContratMap.put(factureId, row);
            contratIds.add(contratId);
        }

        // 2) Récupérer toutes les factures de ces contrats
        List<Object[]> autresRows = em.createNativeQuery("""
        SELECT ff.contratFournisseur_id,
               ff.id,
               ff.dateFacture,
               ff.reference,
               ff.montant
        FROM FactureFournisseur ff
        WHERE ff.contratFournisseur_id IN (:contratIds)
        ORDER BY ff.contratFournisseur_id, ff.dateFacture DESC
        """)
                .setParameter("contratIds", new ArrayList<>(contratIds))
                .getResultList();

        // Grouper par contratId
        var facturesParContrat = new HashMap<Long, List<FactureContratLigneDTO>>();
        for (Object[] row : autresRows) {
            Long contratId = ((Number) row[0]).longValue();
            Long fId = ((Number) row[1]).longValue();
            java.time.LocalDate dateFact = row[2] != null ? ((java.sql.Date) row[2]).toLocalDate() : null;
            String ref = (String) row[3];
            Float montant = row[4] != null ? ((Number) row[4]).floatValue() : null;

            facturesParContrat.computeIfAbsent(contratId, k -> new ArrayList<>())
                    .add(new FactureContratLigneDTO(fId, dateFact, ref, montant));
        }

        // 3) Construire le résultat
        var result = new HashMap<Long, ContratFactureDTO>();
        for (Map.Entry<Long, Object[]> entry : factureContratMap.entrySet()) {
            Long factureId = entry.getKey();
            Object[] row = entry.getValue();
            Long contratId = ((Number) row[1]).longValue();
            String ref = (String) row[2];
            String description = (String) row[3];

            // Exclure la facture courante de la liste "autres factures"
            List<FactureContratLigneDTO> autres = facturesParContrat.getOrDefault(contratId, List.of())
                    .stream()
                    .filter(f -> !f.id().equals(factureId))
                    .toList();

            result.put(factureId, new ContratFactureDTO(contratId, ref, description, autres));
        }
        return result;
    }
}
