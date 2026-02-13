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

        // Grouper par type (ordinal)
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

        // Construire le résultat : tous les types, même ceux sans fichier
        List<TypeFichierMutationDTO> result = new ArrayList<>();
        for (int i = 0; i < TYPES.length; i++) {
            List<FichierMutationInfoDTO> fichiers = parType.getOrDefault(i, List.of());
            result.add(new TypeFichierMutationDTO(TYPES[i][0], TYPES[i][1], fichiers));
        }
        return result;
    }
}