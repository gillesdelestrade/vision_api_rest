// FichierMutationService.java
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.*;

@Stateless
public class FichierMutationService {

    @PersistenceContext
    private EntityManager em;

    // Labels correspondant aux ordinals de TypeFichierMutation
    private static final String[][] TYPES = {
        {"REGLEMENT_COPROPRIETE", "Règlement de Copropriété"},
        {"DOSSIER_AMIANTE", "Diagnostics Amiante - Termites - Plomb"},
        {"CERTIFICAT_IMMATRICULATION", "Certificat d'immatriculation"},
        {"PLAN_PLURIANNUEL_DE_TRAVAUX", "Plan pluriannuel de Travaux"},
        {"LIVRET_ACCUEIL", "Livret d'Accueil"},
        {"PV_AG", "PV d'AG"}
    };

    @SuppressWarnings("unchecked")
public List<TypeFichierMutationDTO> findFichiersMutation(Long coproprieteId) {

    List<Object[]> rows = em.createNativeQuery("""
        SELECT f.id,
               f.nomFichier,
               f.nomStockage,
               f.dateCreation,
               f.typeFichierMutation
        FROM Fichier f
        WHERE f.copropriete_id = :coproprieteId
          AND f.DTYPE = 'FichierMutation'
        ORDER BY f.typeFichierMutation ASC, f.dateCreation DESC
        """)
        .setParameter("coproprieteId", coproprieteId)
        .getResultList();

    var parType = new HashMap<Integer, List<FichierMutationInfoDTO>>();
    for (Object[] row : rows) {
        Long id = ((Number) row[0]).longValue();
        String nomFichier = (String) row[1];
        String nomStockage = (String) row[2];
        java.time.Instant dateCreation = row[3] != null ? (java.time.Instant) row[3] : null;
        Integer typeOrdinal = row[4] != null ? ((Number) row[4]).intValue() : null;

        if (typeOrdinal == null) continue;

        parType.computeIfAbsent(typeOrdinal, k -> new ArrayList<>())
            .add(new FichierMutationInfoDTO(id, nomFichier, nomStockage, dateCreation));
    }

    // PV d'AG de moins de 3 ans
    java.time.Instant dateMin = java.time.LocalDate.now()
        .minusYears(3)
        .atStartOfDay(java.time.ZoneId.systemDefault())
        .toInstant();

    @SuppressWarnings("unchecked")
    List<Object[]> pvagRows = em.createNativeQuery("""
        SELECT p.id,
               p.dateAG,
               f.nomFichier,
               f.nomStockage
        FROM PVAG p
        LEFT JOIN Fichier f ON f.pvag_id = p.id
            AND f.DTYPE = 'FichierPVAG'
        WHERE p.copropriete_id = :coproprieteId
          AND p.dateAG >= :dateMin
        ORDER BY p.dateAG DESC
        """)
        .setParameter("coproprieteId", coproprieteId)
        .setParameter("dateMin", java.sql.Timestamp.from(dateMin))
        .getResultList();

    List<PvagInfoDTO> pvags = new ArrayList<>();
    for (Object[] row : pvagRows) {
        Long id = ((Number) row[0]).longValue();
        java.time.Instant dateAG = row[1] != null ? (java.time.Instant) row[1] : null;
        String nomFichier = (String) row[2];
        String nomStockage = (String) row[3];
        pvags.add(new PvagInfoDTO(id, dateAG, nomFichier, nomStockage));
    }

    // Construire le résultat
    List<TypeFichierMutationDTO> result = new ArrayList<>();
    for (int i = 0; i < TYPES.length; i++) {
        List<FichierMutationInfoDTO> fichiers = parType.getOrDefault(i, List.of());
        // PV_AG est l'ordinal 5
        List<PvagInfoDTO> pvagList = (i == 5) ? pvags : List.of();
        result.add(new TypeFichierMutationDTO(TYPES[i][0], TYPES[i][1], fichiers, pvagList));
    }
    return result;
}
}