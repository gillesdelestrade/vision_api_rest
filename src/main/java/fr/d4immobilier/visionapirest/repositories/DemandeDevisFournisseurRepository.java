package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.dto.DemandeDevisFournisseurResumeDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevisFournisseur;
import jakarta.ejb.Stateless;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class DemandeDevisFournisseurRepository extends GenericRepository<DemandeDevisFournisseur, Long> {
    
    @Override
    protected Class<DemandeDevisFournisseur> getEntityClass() {
        return DemandeDevisFournisseur.class;
    }
    
    /**
 * Trouve les 5 dernières demandes de devis en cours pour une copropriété
 */
public List<DemandeDevisFournisseurResumeDTO> findEnCoursByCoproprieteId(Long coproprieteId) {
    List<Object[]> results = em.createQuery(
        "SELECT d.id, d.demandeDevis.objet, " +
        "       d.demandeDevis.dateDemandeDevis, " +
        "       d.datePriseEnCompteFournisseur, " +
        "       d.periodeRemiseDevisPrevue, " +
        "       d.dateRappel, " +
        "       d.fournisseur.raisonSociale " +
        "FROM DemandeDevisFournisseur d " +
        "WHERE d.dateAnnulation IS NULL " +
        "AND d.dateReceptionDevis IS NULL " +
        "AND d.demandeDevis.demande.dateClotureDefinitive IS NULL " +
        "AND d.devisFournisseurs IS EMPTY " +
        "AND d.demandeDevis.demande.copropriete.id = :coproprieteId " +
        "ORDER BY d.demandeDevis.dateDemandeDevis DESC",
        Object[].class)
        .setParameter("coproprieteId", coproprieteId)
        .setMaxResults(5)
        .getResultList();
    
    List<DemandeDevisFournisseurResumeDTO> dtos = new ArrayList<>();
    
    for (Object[] row : results) {
        DemandeDevisFournisseurResumeDTO dto = new DemandeDevisFournisseurResumeDTO();
        dto.setId((Long) row[0]);
        dto.setObjet((String) row[1]);
        dto.setDateDemandeDevis((LocalDate) row[2]);
        dto.setDatePriseEnCompteFournisseur((Instant) row[3]);
        dto.setPeriodeRemiseDevisPrevue((String) row[4]);
        dto.setDateRappel((java.time.LocalDate) row[5]);
        dto.setFournisseurRaisonSociale((String) row[6]);
        dtos.add(dto);
    }
    
    return dtos;
}
}
