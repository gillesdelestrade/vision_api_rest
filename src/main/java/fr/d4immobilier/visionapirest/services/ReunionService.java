package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.ReunionResumeDTO;
import fr.d4immobilier.visionapirest.entities.*;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.time.ZoneId;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class ReunionService {

    @PersistenceContext
    private EntityManager em;

    @Inject
    private DocumentUrlService documentUrlService;

    /**
     * Récupère toutes les réunions d'une copropriété (Reunion + ReunionV2)
     */
    public List<ReunionResumeDTO> findByCoproprieteId(Long coproprieteId) {
        List<ReunionResumeDTO> resultats = new ArrayList<>();

        // 1. Récupérer les Reunion classiques
        resultats.addAll(findReunionsByCoproprieteId(coproprieteId));

        // 2. Récupérer les ReunionV2
        resultats.addAll(findReunionsV2ByCoproprieteId(coproprieteId));

        // 3. Trier par date décroissante
        resultats.sort(Comparator.comparing(
                ReunionResumeDTO::getDateReunion,
                Comparator.nullsLast(Comparator.reverseOrder())
        ));

        return resultats;
    }

    /**
     * Récupère les Reunion classiques avec leurs points abordés
     */
    private List<ReunionResumeDTO> findReunionsByCoproprieteId(Long coproprieteId) {
        List<Reunion> reunions = em.createQuery(
                "SELECT DISTINCT r FROM Reunion r "
                + "LEFT JOIN FETCH r.pointsAbordes "
                + "WHERE r.copropriete.id = :coproprieteId "
                + "ORDER BY r.dateReunion DESC",
                Reunion.class)
                .setParameter("coproprieteId", coproprieteId)
                .getResultList();

        List<ReunionResumeDTO> dtos = new ArrayList<>();

        for (Reunion r : reunions) {
            ReunionResumeDTO dto = new ReunionResumeDTO();
            dto.setId(r.getId());
            dto.setType("REUNION");
            dto.setDateReunion(r.getDateReunion().atZone(ZoneId.systemDefault()).toLocalDate());
            dto.setObjet(r.getObjet());
            dto.setReunionSansSyndic(Boolean.TRUE.equals(r.getReunionSansSyndic()));

            if (Boolean.TRUE.equals(r.getReunionSansSyndic())) {
                // Réunion sans syndic : PV non rédigé + fichiers joints
                dto.setPointsAbordes(List.of("PV non rédigé par le Syndic"));
                dto.setFichiers(findFichiersReunion(r.getId()));
            } else {
                // Réunion normale : points abordés
                if (r.getPointsAbordes() != null && !r.getPointsAbordes().isEmpty()) {
                    dto.setPointsAbordes(
                            r.getPointsAbordes().stream()
                                    .map(PointAborde::getDescription)
                                    .collect(Collectors.toList())
                    );
                }
            }

            dtos.add(dto);
        }

        return dtos;
    }

    /**
     * Récupère les URLs des fichiers d'une réunion
     */
    private List<String> findFichiersReunion(Long reunionId) {
        List<String> nomsStockage = em.createQuery(
                "SELECT f.nomStockage "
                + "FROM Reunion r JOIN r.fichiersReunion f "
                + "WHERE r.id = :reunionId "
                + "AND f.nomStockage IS NOT NULL",
                String.class)
                .setParameter("reunionId", reunionId)
                .getResultList();

        if (nomsStockage.isEmpty()) {
            return null;
        }

        return nomsStockage.stream()
                .map(documentUrlService::getDocumentUrl)
                .collect(Collectors.toList());
    }

    /**
     * Récupère les ReunionV2 avec les descriptions des demandes
     */
    private List<ReunionResumeDTO> findReunionsV2ByCoproprieteId(Long coproprieteId) {
        // D'abord récupérer les ReunionV2
        List<ReunionV2> reunions = em.createQuery(
                "SELECT DISTINCT r FROM ReunionV2 r "
                + "WHERE r.copropriete.id = :coproprieteId "
                + "ORDER BY r.dateReunion DESC",
                ReunionV2.class)
                .setParameter("coproprieteId", coproprieteId)
                .getResultList();

        List<ReunionResumeDTO> dtos = new ArrayList<>();

        for (ReunionV2 r : reunions) {
            ReunionResumeDTO dto = new ReunionResumeDTO();
            dto.setId(r.getId());
            dto.setType("REUNION_V2");
            dto.setDateReunion(r.getDateReunion().atZone(ZoneId.systemDefault()).toLocalDate());
            dto.setObjet(r.getObjet());
            dto.setReunionSansSyndic(false);
            // Récupérer les descriptions des demandes via evenementsDemandes
            List<String> points = findPointsAbordesReunionV2(r.getId());
            dto.setPointsAbordes(points.isEmpty() ? null : points);

            dtos.add(dto);
        }

        return dtos;
    }

    /**
     * Récupère les descriptions des demandes liées aux événements d'une
     * ReunionV2
     */
    private List<String> findPointsAbordesReunionV2(Long reunionV2Id) {
        return em.createQuery(
                "SELECT ed.demande.description "
                + "FROM ReunionV2 r "
                + "JOIN r.evenementsDemande ed "
                + "JOIN ed.demande "
                + "WHERE r.id = :reunionId "
                + "AND ed.demande.description IS NOT NULL",
                String.class)
                .setParameter("reunionId", reunionV2Id)
                .getResultList();
    }
}
