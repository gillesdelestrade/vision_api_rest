// DematerialisationService.java
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.*;

@Stateless
public class DematerialisationService {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public List<CoproprietaireDematDTO> findAutorisationsDemat(Long coproprieteId) {

        // 1) Récupérer les matricules ICS avec copropriétaires (personne ou société)
        List<Object[]> rows = em.createNativeQuery("""
            SELECT DISTINCT m.id AS matricule_id,
                   m.matricule,
                   c.id AS copro_id,
                   p.id AS personne_id,
                   p.nom,
                   p.prenom,
                   p.mail1 AS mail_personne,
                   s.id AS societe_id,
                   s.raisonSociale,
                   s.mail1 AS mail_societe,
                   COALESCE(p.nom, s.raisonSociale) AS tri,
                   cvp.actif AS cv_personne_actif,
                   cvs.actif AS cv_societe_actif
            FROM MatriculeICS m
            JOIN Coproprietaire c ON m.coproprietaire_id = c.id
            JOIN Lot_Coproprietaire lc ON lc.coproprietaires_id = c.id
            JOIN Lot l ON l.id = lc.lots_id
            LEFT JOIN Personne p ON c.personne_id = p.id
            LEFT JOIN CompteVision cvp ON p.compteVision_id = cvp.id
            LEFT JOIN Societe s ON c.societe_id = s.id
            LEFT JOIN CompteVision cvs ON s.compteVision_id = cvs.id
            WHERE m.copropriete_id = :coproprieteId
              AND l.copropriete_id = :coproprieteId
            ORDER BY COALESCE(p.nom, s.raisonSociale)
            """)
            .setParameter("coproprieteId", coproprieteId)
            .getResultList();

        if (rows.isEmpty()) return List.of();

        // Construire la liste ordonnée et la map par matriculeId
        var matriculeIds = new ArrayList<Long>();
        var matriculeMap = new LinkedHashMap<Long, CoproprietaireDematPartial>();

        for (Object[] row : rows) {
            Long matriculeId = ((Number) row[0]).longValue();
            if (matriculeMap.containsKey(matriculeId)) continue;

            String matricule = (String) row[1];
            Long coproId = ((Number) row[2]).longValue();

            String nom;
            String email;
            Boolean compteActif;

            if (row[3] != null) {
                // Personne
                String nomP = (String) row[4];
                String prenomP = (String) row[5];
                nom = ((prenomP != null ? prenomP : "") + " " + (nomP != null ? nomP : "")).trim();
                email = (String) row[6];
                compteActif = row[11] != null ? (Boolean) row[11] : Boolean.FALSE;
            } else if (row[7] != null) {
                // Société
                nom = (String) row[8];
                email = (String) row[9];
                compteActif = row[12] != null ? (Boolean) row[12] : Boolean.FALSE;
            } else {
                nom = "Inconnu";
                email = null;
                compteActif = false;
            }

            matriculeIds.add(matriculeId);
            matriculeMap.put(matriculeId, new CoproprietaireDematPartial(
                matriculeId, matricule, coproId, nom, email, compteActif));
        }

        // 2) Récupérer les autorisations
        @SuppressWarnings("unchecked")
        List<Object[]> autRows = em.createNativeQuery("""
            SELECT ad.matriculeICS_id,
                   ad.contenuDematerialisation,
                   ad.supportDematerialisation,
                   ad.statutAutorisationDematerialisation
            FROM AutorisationDematerialisation ad
            WHERE ad.matriculeICS_id IN (:matriculeIds)
            """)
            .setParameter("matriculeIds", matriculeIds)
            .getResultList();

        var autorisationsMap = new HashMap<Long, List<AutorisationDematDTO>>();
        for (Object[] ar : autRows) {
            Long matId = ((Number) ar[0]).longValue();
            String contenu = ar[1] != null ? contenuToString(((Number) ar[1]).intValue()) : null;
            String support = ar[2] != null ? supportToString(((Number) ar[2]).intValue()) : null;
            String statut = ar[3] != null ? statutToString(((Number) ar[3]).intValue()) : null;

            autorisationsMap.computeIfAbsent(matId, k -> new ArrayList<>())
                .add(new AutorisationDematDTO(contenu, support, statut));
        }

        // 3) Assembler
        List<CoproprietaireDematDTO> result = new ArrayList<>();
        for (Long matId : matriculeIds) {
            CoproprietaireDematPartial p = matriculeMap.get(matId);
            List<AutorisationDematDTO> autorisations = autorisationsMap.getOrDefault(matId, List.of());
            result.add(new CoproprietaireDematDTO(
                p.matriculeId, p.matricule, p.coproId, p.nom, p.email, p.compteActif, autorisations));
        }
        return result;
    }

    // Record interne pour le stockage temporaire
    private record CoproprietaireDematPartial(
        Long matriculeId, String matricule, Long coproId,
        String nom, String email, Boolean compteActif
    ) {}

    private String contenuToString(int ordinal) {
        return switch (ordinal) {
            case 0 -> "APPEL_DE_FONDS";
            case 1 -> "CONVOCATION_AG";
            case 2 -> "PV_AG";
            case 3 -> "RAPPEL_DE_CHARGES";
            default -> "INCONNU";
        };
    }

    private String supportToString(int ordinal) {
        return switch (ordinal) {
            case 0 -> "PAPIER";
            case 1 -> "MAIL";
            case 2 -> "MAIL_ET_PAPIER";
            default -> "INCONNU";
        };
    }

    private String statutToString(int ordinal) {
        return switch (ordinal) {
            case 0 -> "NON_POSITIONNEE";
            case 1 -> "EXPLICITEMENT_REFUSEE";
            case 2 -> "ACCEPTEE_EN_ATTENTE_VALIDATION";
            case 3 -> "ACCEPTEE_VALIDEE";
            default -> "INCONNU";
        };
    }
}