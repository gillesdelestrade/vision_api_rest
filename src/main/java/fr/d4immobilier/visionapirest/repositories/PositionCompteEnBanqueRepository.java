package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.dto.PositionCompteDTO;
import fr.d4immobilier.visionapirest.entities.PositionCompteEnBanque;
import jakarta.ejb.Stateless;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Stateless
public class PositionCompteEnBanqueRepository extends GenericRepository<PositionCompteEnBanque, Long> {
    
    @Override
    protected Class<PositionCompteEnBanque> getEntityClass() {
        return PositionCompteEnBanque.class;
    }
    
    /**
 * Récupère les 90 dernières positions du compte bancaire d'une copropriété
 */
public List<PositionCompteDTO> findLastPositionsByCoproprieteId(Long coproprieteId) {
    List<Object[]> results = em.createQuery(
        "SELECT p.datePosition, p.position " +
        "FROM PositionCompteEnBanque p " +
        "WHERE p.compteEnBanque.copropriete.id = :coproprieteId " +
        "ORDER BY p.datePosition DESC",
        Object[].class)
        .setParameter("coproprieteId", coproprieteId)
        .setMaxResults(90)
        .getResultList();
    
    List<PositionCompteDTO> dtos = new ArrayList<>();
    
    for (Object[] row : results) {
        PositionCompteDTO dto = new PositionCompteDTO();
        dto.setDate((LocalDate) row[0]);
        dto.setSolde((Double) row[1]);
        dtos.add(dto);
    }
    
    // Inverser pour avoir l'ordre chronologique (du plus ancien au plus récent)
    Collections.reverse(dtos);
    
    return dtos;
}
}
