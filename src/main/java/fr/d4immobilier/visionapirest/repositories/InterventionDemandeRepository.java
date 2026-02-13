package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.dto.InterventionDemandeResumeDTO;
import fr.d4immobilier.visionapirest.dto.InterventionFournisseurRow;
import fr.d4immobilier.visionapirest.entities.InterventionDemande;
import jakarta.ejb.Stateless;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Stateless
public class InterventionDemandeRepository extends GenericRepository<InterventionDemande, Long> {

    @Override
    protected Class<InterventionDemande> getEntityClass() {
        return InterventionDemande.class;
    }

    /**
     * Trouve les 5 dernières interventions en cours pour une copropriété
     *
     * @param coproprieteId
     * @return
     */
    public List<InterventionDemandeResumeDTO> findEnCoursByCoproprieteId(Long coproprieteId) {
        List<Object[]> results = em.createQuery(
                "SELECT i.id, i.objet, i.datePriseEnCompteFournisseur, "
                + "       i.plageInterventionPrevue, i.dateRappel, "
                + "       i.fournisseur.raisonSociale, "
                + "       i.dateCreationDemande "
                + "FROM InterventionDemande i "
                + "WHERE i.dateAnnulation IS NULL "
                + "AND i.dateInterventionRealisee IS NULL "
                + "AND i.demande.dateClotureDefinitive IS NULL "
                + "AND i.factureFournisseur IS NULL "
                + "AND i.demande.copropriete.id = :coproprieteId "
                + "ORDER BY i.dateCreationDemande DESC",
                Object[].class)
                .setParameter("coproprieteId", coproprieteId)
                .setMaxResults(5)
                .getResultList();

        List<InterventionDemandeResumeDTO> dtos = new ArrayList<>();

        for (Object[] row : results) {
            InterventionDemandeResumeDTO dto = new InterventionDemandeResumeDTO();
            dto.setId((Long) row[0]);
            dto.setObjet((String) row[1]);
            dto.setDatePriseEnCompteFournisseur((Instant) row[2]);
            dto.setPlageInterventionPrevue((String) row[3]);
            dto.setDateRappel((java.time.LocalDate) row[4]);
            dto.setFournisseurRaisonSociale((String) row[5]);
            dto.setDateCreationDemande((Instant) row[6]);  // ← Ajout
            dtos.add(dto);
        }

        return dtos;
    }

    public List<InterventionDemandeResumeDTO> findAllEnCoursByCoproprieteId(Long coproprieteId) {
        List<Object[]> results = em.createQuery(
                "SELECT i.id, i.objet, i.datePriseEnCompteFournisseur, "
                + "       i.plageInterventionPrevue, i.dateRappel, "
                + "       i.fournisseur.raisonSociale, "
                + "       i.dateCreationDemande "
                + "FROM InterventionDemande i "
                + "WHERE i.dateAnnulation IS NULL "
                + "AND i.dateInterventionRealisee IS NULL "
                + "AND i.demande.dateClotureDefinitive IS NULL "
                + "AND i.factureFournisseur IS NULL "
                + "AND i.demande.copropriete.id = :coproprieteId "
                + "ORDER BY i.dateCreationDemande DESC",
                Object[].class)
                .setParameter("coproprieteId", coproprieteId)
                .getResultList();

        List<InterventionDemandeResumeDTO> dtos = new ArrayList<>();

        for (Object[] row : results) {
            InterventionDemandeResumeDTO dto = new InterventionDemandeResumeDTO();
            dto.setId((Long) row[0]);
            dto.setObjet((String) row[1]);
            dto.setDatePriseEnCompteFournisseur((Instant) row[2]);
            dto.setPlageInterventionPrevue((String) row[3]);
            dto.setDateRappel((java.time.LocalDate) row[4]);
            dto.setFournisseurRaisonSociale((String) row[5]);
            dto.setDateCreationDemande((Instant) row[6]);  // ← Ajout
            dtos.add(dto);
        }

        return dtos;
    }

    

    public List<InterventionFournisseurRow> findTermineesByCopropriete(Long coproprieteId) {
        return em.createQuery("""
                SELECT new fr.d4immobilier.visionapirest.dto.InterventionFournisseurRow(
                    i.id, i.objet, i.fournisseur.id, i.fournisseur.raisonSociale,
                    i.dateCreationDemande)
                FROM InterventionDemande i
                WHERE (i.dateAnnulation IS NOT NULL
                    OR i.dateInterventionRealisee IS NULL
                    OR i.demande.dateClotureDefinitive IS NULL
                    OR i.factureFournisseur IS NULL)
                  AND i.demande.copropriete.id = :coproprieteId
                ORDER BY i.fournisseur.raisonSociale ASC, i.dateCreationDemande DESC
                """, InterventionFournisseurRow.class)
                .setParameter("coproprieteId", coproprieteId)
                .getResultList();
    }

    
    
    
   

    public Optional<InterventionDemande> findDetailById(Long id) {
        var result = em.createQuery("""
                SELECT i FROM InterventionDemande i
                LEFT JOIN FETCH i.fournisseur
                LEFT JOIN FETCH i.devisFournisseur 
                LEFT JOIN FETCH i.devisFournisseur.fichierDevisFournisseur
                LEFT JOIN FETCH i.fichierDemandeIntervention
                LEFT JOIN FETCH i.demande
                WHERE i.id = :id
                """, InterventionDemande.class)
                .setParameter("id", id)
                .getResultStream()
                .findFirst();

        return result;
    }
}
