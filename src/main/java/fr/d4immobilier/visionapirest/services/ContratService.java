// ContratService.java
package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.time.LocalDate;
import java.util.*;

@Stateless
public class ContratService {

    @PersistenceContext
    private EntityManager em;

    public ContratsResponseDTO findContrats(Long coproprieteId) {
        LocalDate today = LocalDate.now();

        // 1) Tous les contrats de la copropriété avec fournisseur et prestation
        @SuppressWarnings("unchecked")
        List<Object[]> rows = em.createNativeQuery("""
            SELECT cf.id,
                   cf.reference,
                   cf.description,
                   cf.dateDebut,
                   cf.dateFin,
                   cf.montantForfait,
                   cf.frequenceFactures,
                   f.id AS fournisseur_id,
                   f.raisonSociale,
                   pc.id AS prestation_id,
                   pc.prestation
            FROM ContratFournisseur cf
            JOIN Societe f ON cf.fournisseur_id = f.id
            LEFT JOIN PrestationContrat pc ON cf.prestationContrat_id = pc.id
            WHERE cf.copropriete_id = :coproprieteId
            ORDER BY pc.prestation ASC, f.raisonSociale ASC
            """)
            .setParameter("coproprieteId", coproprieteId)
            .getResultList();

        if (rows.isEmpty()) {
            return new ContratsResponseDTO(List.of(), List.of());
        }

        // Collecter les IDs des contrats
        List<Long> contratIds = rows.stream()
            .map(r -> ((Number) r[0]).longValue())
            .toList();

        // 2) Fichiers des contrats
        @SuppressWarnings("unchecked")
        List<Object[]> fichierRows = em.createNativeQuery("""
            SELECT fc.contratFournisseur_id,
                   fc.id,
                   fc.nomFichier,
                   fc.nomStockage
            FROM Fichier fc
            WHERE fc.contratFournisseur_id IN (:contratIds)
            ORDER BY fc.contratFournisseur_id
            """)
            .setParameter("contratIds", contratIds)
            .getResultList();

        var fichiersParContrat = new HashMap<Long, List<FichierContratInfoDTO>>();
        for (Object[] fr : fichierRows) {
            Long contratId = ((Number) fr[0]).longValue();
            Long fichierId = ((Number) fr[1]).longValue();
            String nomFichier = (String) fr[2];
            String nomStockage = (String) fr[3];
            fichiersParContrat
                .computeIfAbsent(contratId, k -> new ArrayList<>())
                .add(new FichierContratInfoDTO(fichierId, nomFichier, nomStockage));
        }

        // 3) Séparer en cours / terminés et grouper par prestation
        var enCoursParPrestation = new LinkedHashMap<Long, List<ContratDTO>>();
        var terminesParPrestation = new LinkedHashMap<Long, List<ContratDTO>>();
        var prestationNoms = new HashMap<Long, String>();

        // Prestation "Autres" pour les contrats sans prestation
        Long autresId = -1L;
        prestationNoms.put(autresId, "Autres");

        for (Object[] row : rows) {
            Long contratId = ((Number) row[0]).longValue();
            String reference = (String) row[1];
            String description = (String) row[2];
            LocalDate dateDebut = row[3] != null ? ((java.sql.Date) row[3]).toLocalDate() : null;
            LocalDate dateFin = row[4] != null ? ((java.sql.Date) row[4]).toLocalDate() : null;
            Float montantForfait = row[5] != null ? ((Number) row[5]).floatValue() : null;
            String frequenceFactures = row[6] != null ? row[6].toString() : null;
            Long fournisseurId = ((Number) row[7]).longValue();
            String raisonSociale = (String) row[8];
            Long prestationId = row[9] != null ? ((Number) row[9]).longValue() : autresId;
            String prestationNom = (String) row[10];

            if (prestationNom != null) {
                prestationNoms.put(prestationId, prestationNom);
            }

            FournisseurSimpleDTO fournisseurDTO = new FournisseurSimpleDTO(fournisseurId, raisonSociale);
            List<FichierContratInfoDTO> fichiers = fichiersParContrat.getOrDefault(contratId, List.of());

            ContratDTO contratDTO = new ContratDTO(
                contratId, reference, description, dateDebut, dateFin,
                montantForfait, frequenceFactures, fournisseurDTO, fichiers
            );

            // En cours = dateFin null ou dateFin >= aujourd'hui
            boolean enCours = (dateFin == null || !dateFin.isBefore(today));

            if (enCours) {
                enCoursParPrestation.computeIfAbsent(prestationId, k -> new ArrayList<>()).add(contratDTO);
            } else {
                terminesParPrestation.computeIfAbsent(prestationId, k -> new ArrayList<>()).add(contratDTO);
            }
        }

        // 4) Construire les listes groupées
        List<PrestationContratsDTO> contratsEnCours = buildPrestationList(enCoursParPrestation, prestationNoms);
        List<PrestationContratsDTO> contratsTermines = buildPrestationList(terminesParPrestation, prestationNoms);

        return new ContratsResponseDTO(contratsEnCours, contratsTermines);
    }

    private List<PrestationContratsDTO> buildPrestationList(
            Map<Long, List<ContratDTO>> parPrestation, Map<Long, String> prestationNoms) {
        List<PrestationContratsDTO> result = new ArrayList<>();
        for (Map.Entry<Long, List<ContratDTO>> entry : parPrestation.entrySet()) {
            Long prestationId = entry.getKey();
            String nom = prestationNoms.getOrDefault(prestationId, "Autres");
            result.add(new PrestationContratsDTO(prestationId, nom, entry.getValue()));
        }
        // Trier par nom de prestation, "Autres" en dernier
        result.sort((a, b) -> {
            if (a.prestationId() == -1L) return 1;
            if (b.prestationId() == -1L) return -1;
            return a.prestation().compareToIgnoreCase(b.prestation());
        });
        return result;
    }
}