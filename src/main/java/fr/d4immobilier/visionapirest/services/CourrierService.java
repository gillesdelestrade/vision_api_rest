// CourrierService.java
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.time.ZoneId;

import java.util.*;

@Stateless
public class CourrierService {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public List<AnneeCourriersDTO> findCourriers(Long coproprieteId) {

        List<Object[]> rows = em.createNativeQuery("""
            SELECT d.id,
                   d.dateCreation,
                   p.prenom,
                   p.nom,
                   d.titre,
                   d.reference,
                   d.recommandeAR,
                   d.adresseSaisie,
                   d.demande_id,
                   dem.description
            FROM Document d
            LEFT JOIN Personne p ON d.auteur_id = p.id
            LEFT JOIN Demande dem ON d.demande_id = dem.id
            WHERE d.copropriete_id = :coproprieteId
              AND d.DTYPE IN ('Courrier', 'CourrierDemande')
            ORDER BY d.dateCreation DESC
            """)
            .setParameter("coproprieteId", coproprieteId)
            .getResultList();

        if (rows.isEmpty()) return List.of();

        var parAnnee = new TreeMap<Integer, List<CourrierListDTO>>(Comparator.reverseOrder());

        for (Object[] row : rows) {
            Long id = ((Number) row[0]).longValue();
            java.time.Instant dateCreation = row[1] != null ? ((java.sql.Date) row[1]).toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant() : null;
            String prenom = (String) row[2];
            String nom = (String) row[3];
            String titre = (String) row[4];
            String reference = (String) row[5];
            Boolean recommandeAR = row[6] != null ? ((Boolean) row[6]) : null;
            String adresseSaisie = (String) row[7];
            Long demandeId = row[8] != null ? ((Number) row[8]).longValue() : null;
            String demandeDescription = (String) row[9];

            String auteur = null;
            if (prenom != null || nom != null) {
                auteur = ((prenom != null ? prenom : "") + " " + (nom != null ? nom : "")).trim();
            }

            DemandeLieDTO demande = null;
            if (demandeId != null) {
                demande = new DemandeLieDTO(demandeId, demandeDescription);
            }

            Integer annee = 0;
            if (dateCreation != null) {
                annee = dateCreation.atZone(java.time.ZoneId.systemDefault()).getYear();
            }

            parAnnee.computeIfAbsent(annee, k -> new ArrayList<>())
                .add(new CourrierListDTO(id, dateCreation, auteur, titre, reference, recommandeAR, adresseSaisie, demande));
        }

        List<AnneeCourriersDTO> result = new ArrayList<>();
        for (Map.Entry<Integer, List<CourrierListDTO>> entry : parAnnee.entrySet()) {
            result.add(new AnneeCourriersDTO(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}