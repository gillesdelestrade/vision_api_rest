// DevisEnCoursService.java
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.time.LocalDate;

import java.util.List;

@Stateless
public class DevisEnCoursService {

    @PersistenceContext
    private EntityManager em;

    public DevisEnCoursResponseDTO findDevisEnCours(Long coproprieteId) {
        List<DemandeDevisEnCoursDTO> demandesDevis = buildDemandesDevis(coproprieteId);
        List<DevisOrphelinDTO> devisOrphelins = buildDevisOrphelins(coproprieteId);
        return new DevisEnCoursResponseDTO(demandesDevis, devisOrphelins);
    }

    // ── Demandes de devis en cours ──
    @SuppressWarnings("unchecked")
    private List<DemandeDevisEnCoursDTO> buildDemandesDevis(Long coproprieteId) {

        // 1) Récupérer les demandes de devis en cours avec le type de la demande parente
        List<Object[]> rows = em.createNativeQuery("""
            SELECT dd.id AS dd_id,
                   dd.objet,
                   dd.dateDemandeDevis,
                   d.id AS demande_id,
                   d.ag,
                   d.DTYPE,
                   dd.dateCloture
            FROM DemandeDevis dd
            JOIN Demande d ON dd.demande_id = d.id
            WHERE d.copropriete_id = :coproprieteId
                AND d.dateClotureDefinitive IS NULL
                AND d.dtype in ('Demande','Sinistre','Procedure')
                AND dd.dateCloture IS NULL
            ORDER BY dd.dateDemandeDevis DESC
            """)
                .setParameter("coproprieteId", coproprieteId)
                .getResultList();

        if (rows.isEmpty()) {
            return List.of();
        }

        // Collecter les IDs des demandes de devis
        List<Long> ddIds = rows.stream()
                .map(r -> ((Number) r[0]).longValue())
                .toList();

        // Collecter les IDs des demandes parentes (pour rattachement)
        List<Long> demandeIds = rows.stream()
                .map(r -> ((Number) r[3]).longValue())
                .distinct()
                .toList();

        // 2) Récupérer les fournisseurs et leurs devis en une seule requête
        List<Object[]> fournisseurRows = em.createNativeQuery("""
            SELECT ddf.id AS ddf_id,
                   ddf.demandeDevis_id,
                   ddf.dateAnnulation,
                   f.id AS fournisseur_id,
                   f.raisonSociale,
                   p.prenom,
                   p.nom,
                   df.id AS devis_id,
                   df.reference AS devis_reference,
                   df.montant,
                   df.dateReception,
                   fdf.nomStockage
            FROM DemandeDevisFournisseur ddf
            JOIN Societe f ON ddf.fournisseur_id = f.id
            LEFT JOIN Personne p ON f.representant_id = p.id
            LEFT JOIN DevisFournisseur df ON df.demandeDevisFournisseur_id = ddf.id
            LEFT JOIN Fichier fdf on df.id=fdf.devisFournisseur_id
            WHERE ddf.demandeDevis_id IN (:ddIds)
            ORDER BY ddf.demandeDevis_id, f.raisonSociale
            """)
                .setParameter("ddIds", ddIds)
                .getResultList();

        // Indexer les fournisseurs par demandeDevis_id
        var fournisseursParDd = new java.util.LinkedHashMap<Long, List<FournisseurDevisDTO>>();
        // Gérer les doublons ddf (un ddf peut avoir plusieurs devisFournisseurs)
        var ddfDevisMap = new java.util.LinkedHashMap<Long, FournisseurDevisDTO>();

        for (Object[] fr : fournisseurRows) {
            Long ddfId = ((Number) fr[0]).longValue();
            Long ddId = ((Number) fr[1]).longValue();
            java.time.LocalDate dateAnnulation = fr[2] != null ? ((java.sql.Date) fr[2]).toLocalDate() : null;
            Long fournisseurId = ((Number) fr[3]).longValue();
            String raisonSociale = (String) fr[4];
            String prenom = (String) fr[5];
            String nom = (String) fr[6];

            Long devisId = fr[7] != null ? ((Number) fr[7]).longValue() : null;
            String devisRef = (String) fr[8];
            Float montant = fr[9] != null ? ((Number) fr[9]).floatValue() : null;
            java.time.LocalDate dateReception = fr[10] != null ? ((java.sql.Date) fr[10]).toLocalDate() : null;
            String nomStockage = fr[11] != null ? (String) fr[11] : null;
            String contact = null;
            if (prenom != null || nom != null) {
                contact = ((prenom != null ? prenom : "") + " " + (nom != null ? nom : "")).trim();
            }

            DevisInfoDTO devisInfo = null;
            if (devisId != null) {
                devisInfo = new DevisInfoDTO(devisRef, montant, dateReception, "/api/devis/" + devisId + "/pdf", nomStockage);
            }

            String statutFournisseur;
            if (dateAnnulation != null) {
                statutFournisseur = "annule";
            } else if (devisId != null) {
                statutFournisseur = "recu";
            } else {
                statutFournisseur = "en_attente";
            }

            // Si on a déjà vu ce ddf et qu'on a maintenant un devis plus récent, on met à jour
            if (!ddfDevisMap.containsKey(ddfId)) {
                FournisseurDevisDTO dto = new FournisseurDevisDTO(fournisseurId, raisonSociale, contact, statutFournisseur, devisInfo);
                ddfDevisMap.put(ddfId, dto);
                fournisseursParDd.computeIfAbsent(ddId, k -> new java.util.ArrayList<>()).add(dto);
            }
            // Si un devis arrive pour un ddf déjà en_attente, on pourrait le mettre à jour
            // mais en pratique le ORDER BY gère ça
        }

        // 3) Récupérer les rattachements sinistre
        var rattachementsSinistre = new java.util.HashMap<Long, RattachementDTO>();
        List<Long> sinistreIds = rows.stream()
                .filter(r -> "Sinistre".equals(r[5]))
                .map(r -> ((Number) r[3]).longValue())
                .distinct()
                .toList();

        if (!sinistreIds.isEmpty()) {
            List<Object[]> sinRows = em.createNativeQuery("""
                SELECT d.id, d.titre
                FROM Demande d
                WHERE d.id IN (:ids) AND d.DTYPE = 'Sinistre'
                """)
                    .setParameter("ids", sinistreIds)
                    .getResultList();
            for (Object[] sr : sinRows) {
                Long id = ((Number) sr[0]).longValue();
                String titre = (String) sr[1];
                rattachementsSinistre.put(id, new RattachementDTO("sinistre", id, titre, null));
            }
        }

        // 4) Récupérer les rattachements AG
        var rattachementsAG = new java.util.HashMap<Long, RattachementDTO>();
        List<Long> agDemandeIds = rows.stream()
                .filter(r -> Boolean.TRUE.equals(r[4]) || (r[4] instanceof Number n && n.intValue() == 1))
                .map(r -> ((Number) r[3]).longValue())
                .distinct()
                .toList();

        if (!agDemandeIds.isEmpty()) {
            List<Object[]> agRows = em.createNativeQuery("""
                SELECT rt.demande_id,
                       a.id AS assemblee_id,
                       a.dateAssemblee,
                       r.numero
                FROM ResolutionTravaux rt
                JOIN Resolution r ON rt.resolutionEnveloppe_id = r.id
                JOIN Assemblee a ON r.assemblee_id = a.id
                WHERE rt.demande_id IN (:ids)
                """)
                    .setParameter("ids", agDemandeIds)
                    .getResultList();
            for (Object[] ar : agRows) {
                Long demandeId = ((Number) ar[0]).longValue();
                Long assembleeId = ((Number) ar[1]).longValue();
                java.time.Instant dateAssemblee = ar[2] != null ? ((java.sql.Timestamp) ar[2]).toInstant() : null;
                Integer numero = ar[3] != null ? ((Number) ar[3]).intValue() : null;

                String refAG = null;
                if (dateAssemblee != null) {
                    refAG = "AG-" + dateAssemblee.atZone(java.time.ZoneId.systemDefault())
                            .format(java.time.format.DateTimeFormatter.ofPattern("yyyy"));
                }
                String resolutionLabel = numero != null ? "Résolution n°" + numero : null;
                rattachementsAG.put(demandeId, new RattachementDTO("ag", assembleeId, refAG, resolutionLabel));
            }
        }

        // 5) Assembler le résultat
        List<DemandeDevisEnCoursDTO> result = new java.util.ArrayList<>();
        for (Object[] row : rows) {
            Long ddId = ((Number) row[0]).longValue();
            String objet = (String) row[1];
            java.time.LocalDate date = row[2] != null ? ((java.sql.Date) row[2]).toLocalDate() : null;
            Long demandeId = ((Number) row[3]).longValue();
            String dtype = (String) row[5];
            boolean isAg = Boolean.TRUE.equals(row[4]) || (row[4] instanceof Number n && n.intValue() == 1);

            String type;
            RattachementDTO rattachement = null;
            if ("Sinistre".equals(dtype)) {
                type = "sinistre";
                rattachement = rattachementsSinistre.get(demandeId);
            } else if (isAg) {
                type = "ag";
                rattachement = rattachementsAG.get(demandeId);
            } else {
                type = "demande";
            }

            List<FournisseurDevisDTO> fournisseurs = fournisseursParDd.getOrDefault(ddId, List.of());

            result.add(new DemandeDevisEnCoursDTO(ddId, objet, date, type, "en_cours", rattachement, fournisseurs));
        }

        return result;
    }

    // ── Devis orphelins ──
    @SuppressWarnings("unchecked")
    private List<DevisOrphelinDTO> buildDevisOrphelins(Long coproprieteId) {
        LocalDate dateMin = LocalDate.of(LocalDate.now().getYear() - 2, 1, 1);
        List<Object[]> rows = em.createNativeQuery("""
            SELECT df.id,
                   f.id AS fournisseur_id,
                   f.raisonSociale,
                   df.montant,
                   df.dateReception
            FROM DevisFournisseur df
            LEFT JOIN Societe f ON df.fournisseur_id = f.id
            WHERE df.copropriete_id = :coproprieteId
              AND df.demandeDevisFournisseur_id IS NULL
              AND df.dateReception >= :dateMin
            ORDER BY df.dateReception DESC
            """)
                .setParameter("coproprieteId", coproprieteId)
                .setParameter("dateMin", dateMin)
                .getResultList();

        List<DevisOrphelinDTO> result = new java.util.ArrayList<>();
        for (Object[] row : rows) {
            Long id = ((Number) row[0]).longValue();
            Long fournisseurId = row[1] != null ? ((Number) row[1]).longValue() : null;
            String raisonSociale = (String) row[2];
            Float montant = row[3] != null ? ((Number) row[3]).floatValue() : null;
            java.time.LocalDate dateReception = row[4] != null ? ((java.sql.Date) row[4]).toLocalDate() : null;

            FournisseurSimpleDTO fDTO = fournisseurId != null
                    ? new FournisseurSimpleDTO(fournisseurId, raisonSociale)
                    : null;

            String mois = dateReception != null
                    ? dateReception.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM"))
                    : null;

            result.add(new DevisOrphelinDTO(id, fDTO, montant, dateReception, "/api/devis/" + id + "/pdf", mois));
        }
        return result;
    }

    public DevisCloturesResponseDTO findDevisClotures(Long coproprieteId, int anneeDebut, int anneeFin) {
        LocalDate dateDebut = LocalDate.of(anneeDebut, 1, 1);
        LocalDate dateFin = LocalDate.of(anneeFin, 12, 31);

        List<DemandeDevisEnCoursDTO> demandesCloturees = buildDemandesDevisCloturees(coproprieteId, dateDebut, dateFin);
        List<DevisOrphelinDTO> devisAnciens = buildDevisAnciens(coproprieteId, dateDebut, dateFin);
        return new DevisCloturesResponseDTO(demandesCloturees, devisAnciens);
    }

// ── Demandes de devis clôturées ──
    @SuppressWarnings("unchecked")
    private List<DemandeDevisEnCoursDTO> buildDemandesDevisCloturees(Long coproprieteId, LocalDate dateDebut, LocalDate dateFin) {

        // 1) Demandes de devis clôturées (soit dd.dateCloture non null, soit demande.dateClotureDefinitive non null)
        List<Object[]> rows = em.createNativeQuery("""
        SELECT dd.id AS dd_id,
               dd.objet,
               dd.dateDemandeDevis,
               d.id AS demande_id,
               d.ag,
               d.DTYPE,
               dd.dateCloture,
               dd.motifClotureDemandeDevis
        FROM DemandeDevis dd
        JOIN Demande d ON dd.demande_id = d.id
        WHERE d.copropriete_id = :coproprieteId
          AND (dd.dateCloture IS NOT NULL OR d.dateClotureDefinitive IS NOT NULL)
          AND dd.dateDemandeDevis >= :dateDebut
          AND dd.dateDemandeDevis <= :dateFin
        ORDER BY dd.dateDemandeDevis DESC
        """)
                .setParameter("coproprieteId", coproprieteId)
                .setParameter("dateDebut", dateDebut)
                .setParameter("dateFin", dateFin)
                .getResultList();

        if (rows.isEmpty()) {
            return List.of();
        }

        List<Long> ddIds = rows.stream()
                .map(r -> ((Number) r[0]).longValue())
                .toList();

        List<Long> demandeIds = rows.stream()
                .map(r -> ((Number) r[3]).longValue())
                .distinct()
                .toList();

        // 2) Fournisseurs et devis
        List<Object[]> fournisseurRows = em.createNativeQuery("""
        SELECT ddf.id AS ddf_id,
               ddf.demandeDevis_id,
               ddf.dateAnnulation,
               f.id AS fournisseur_id,
               f.raisonSociale,
               p.prenom,
               p.nom,
               df.id AS devis_id,
               df.reference AS devis_reference,
               df.montant,
               df.dateReception,
               fdv.nomStockage
        FROM DemandeDevisFournisseur ddf
        JOIN Societe f ON ddf.fournisseur_id = f.id
        LEFT JOIN Personne p ON f.representant_id = p.id
        LEFT JOIN DevisFournisseur df ON df.demandeDevisFournisseur_id = ddf.id
        LEFT JOIN Fichier fdv ON fdv.devisFournisseur_id = df.id
        WHERE ddf.demandeDevis_id IN (:ddIds)
        ORDER BY ddf.demandeDevis_id, f.raisonSociale
        """)
                .setParameter("ddIds", ddIds)
                .getResultList();

        var fournisseursParDd = new java.util.LinkedHashMap<Long, List<FournisseurDevisDTO>>();
        var ddfVus = new java.util.HashSet<Long>();

        for (Object[] fr : fournisseurRows) {
            Long ddfId = ((Number) fr[0]).longValue();
            Long ddId = ((Number) fr[1]).longValue();
            java.time.LocalDate dateAnnulation = fr[2] != null ? ((java.sql.Date) fr[2]).toLocalDate() : null;
            Long fournisseurId = ((Number) fr[3]).longValue();
            String raisonSociale = (String) fr[4];
            String prenom = (String) fr[5];
            String nom = (String) fr[6];
            Long devisId = fr[7] != null ? ((Number) fr[7]).longValue() : null;
            String devisRef = (String) fr[8];
            Float montant = fr[9] != null ? ((Number) fr[9]).floatValue() : null;
            java.time.LocalDate dateReception = fr[10] != null ? ((java.sql.Date) fr[10]).toLocalDate() : null;
            String nomStockage = (String) fr[11];

            String contact = null;
            if (prenom != null || nom != null) {
                contact = ((prenom != null ? prenom : "") + " " + (nom != null ? nom : "")).trim();
            }

            DevisInfoDTO devisInfo = null;
            if (devisId != null) {
                devisInfo = new DevisInfoDTO(devisRef, montant, dateReception, "/api/devis/" + devisId + "/pdf", nomStockage);
            }

            String statutFournisseur;
            if (dateAnnulation != null) {
                statutFournisseur = "annule";
            } else if (devisId != null) {
                statutFournisseur = "recu";
            } else {
                statutFournisseur = "en_attente";
            }

            if (!ddfVus.contains(ddfId)) {
                ddfVus.add(ddfId);
                FournisseurDevisDTO dto = new FournisseurDevisDTO(fournisseurId, raisonSociale, contact, statutFournisseur, devisInfo);
                fournisseursParDd.computeIfAbsent(ddId, k -> new java.util.ArrayList<>()).add(dto);
            }
        }

        // 3) Rattachements sinistre
        var rattachementsSinistre = new java.util.HashMap<Long, RattachementDTO>();
        List<Long> sinistreIds = rows.stream()
                .filter(r -> "Sinistre".equals(r[5]))
                .map(r -> ((Number) r[3]).longValue())
                .distinct()
                .toList();

        if (!sinistreIds.isEmpty()) {
            List<Object[]> sinRows = em.createNativeQuery("""
            SELECT d.id, d.titre
            FROM Demande d
            WHERE d.id IN (:ids) AND d.DTYPE = 'Sinistre'
            """)
                    .setParameter("ids", sinistreIds)
                    .getResultList();
            for (Object[] sr : sinRows) {
                Long id = ((Number) sr[0]).longValue();
                String titre = (String) sr[1];
                rattachementsSinistre.put(id, new RattachementDTO("sinistre", id, titre, null));
            }
        }

        // 4) Rattachements AG
        var rattachementsAG = new java.util.HashMap<Long, RattachementDTO>();
        List<Long> agDemandeIds = rows.stream()
                .filter(r -> Boolean.TRUE.equals(r[4]) || (r[4] instanceof Number n && n.intValue() == 1))
                .map(r -> ((Number) r[3]).longValue())
                .distinct()
                .toList();

        if (!agDemandeIds.isEmpty()) {
            List<Object[]> agRows = em.createNativeQuery("""
            SELECT rt.demande_id,
                   a.id AS assemblee_id,
                   a.dateAssemblee,
                   r.numero
            FROM ResolutionTravaux rt
            JOIN Resolution r ON rt.resolutionEnveloppe_id = r.id
            JOIN Assemblee a ON r.assemblee_id = a.id
            WHERE rt.demande_id IN (:ids)
            """)
                    .setParameter("ids", agDemandeIds)
                    .getResultList();
            for (Object[] ar : agRows) {
                Long demandeId = ((Number) ar[0]).longValue();
                Long assembleeId = ((Number) ar[1]).longValue();
                java.time.Instant dateAssemblee = ar[2] != null ? ((java.sql.Timestamp) ar[2]).toInstant() : null;
                Integer numero = ar[3] != null ? ((Number) ar[3]).intValue() : null;

                String refAG = null;
                if (dateAssemblee != null) {
                    refAG = "AG-" + dateAssemblee.atZone(java.time.ZoneId.systemDefault())
                            .format(java.time.format.DateTimeFormatter.ofPattern("yyyy"));
                }
                String resolutionLabel = numero != null ? "Résolution n°" + numero : null;
                rattachementsAG.put(demandeId, new RattachementDTO("ag", assembleeId, refAG, resolutionLabel));
            }
        }

        // 5) Assembler
        List<DemandeDevisEnCoursDTO> result = new java.util.ArrayList<>();
        for (Object[] row : rows) {
            Long ddId = ((Number) row[0]).longValue();
            String objet = (String) row[1];
            java.time.LocalDate date = row[2] != null ? ((java.sql.Date) row[2]).toLocalDate() : null;
            Long demandeId = ((Number) row[3]).longValue();
            String dtype = (String) row[5];
            boolean isAg = Boolean.TRUE.equals(row[4]) || (row[4] instanceof Number n && n.intValue() == 1);

            String type;
            RattachementDTO rattachement = null;
            if ("Sinistre".equals(dtype)) {
                type = "sinistre";
                rattachement = rattachementsSinistre.get(demandeId);
            } else if (isAg) {
                type = "ag";
                rattachement = rattachementsAG.get(demandeId);
            } else {
                type = "demande";
            }

            List<FournisseurDevisDTO> fournisseurs = fournisseursParDd.getOrDefault(ddId, List.of());
            result.add(new DemandeDevisEnCoursDTO(ddId, objet, date, type, "cloture", rattachement, fournisseurs));
        }

        return result;
    }

// ── Devis anciens (orphelins dans la période) ──
    @SuppressWarnings("unchecked")
    private List<DevisOrphelinDTO> buildDevisAnciens(Long coproprieteId, LocalDate dateDebut, LocalDate dateFin) {
        List<Object[]> rows = em.createNativeQuery("""
        SELECT df.id,
               f.id AS fournisseur_id,
               f.raisonSociale,
               df.montant,
               df.dateReception
        FROM DevisFournisseur df
        LEFT JOIN Societe f ON df.fournisseur_id = f.id
        WHERE df.copropriete_id = :coproprieteId
          AND df.demandeDevisFournisseur_id IS NULL
          AND df.dateReception >= :dateDebut
          AND df.dateReception <= :dateFin
        ORDER BY df.dateReception DESC
        """)
                .setParameter("coproprieteId", coproprieteId)
                .setParameter("dateDebut", dateDebut)
                .setParameter("dateFin", dateFin)
                .getResultList();

        List<DevisOrphelinDTO> result = new java.util.ArrayList<>();
        for (Object[] row : rows) {
            Long id = ((Number) row[0]).longValue();
            Long fournisseurId = row[1] != null ? ((Number) row[1]).longValue() : null;
            String raisonSociale = (String) row[2];
            Float montant = row[3] != null ? ((Number) row[3]).floatValue() : null;
            java.time.LocalDate dateReception = row[4] != null ? ((java.sql.Date) row[4]).toLocalDate() : null;

            FournisseurSimpleDTO fDTO = fournisseurId != null
                    ? new FournisseurSimpleDTO(fournisseurId, raisonSociale)
                    : null;

            String mois = dateReception != null
                    ? dateReception.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM"))
                    : null;

            result.add(new DevisOrphelinDTO(id, fDTO, montant, dateReception, "/api/devis/" + id + "/pdf", mois));
        }
        return result;
    }
}
