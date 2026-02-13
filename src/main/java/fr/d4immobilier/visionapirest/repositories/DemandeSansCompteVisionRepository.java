package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DemandeSansCompteVision;
import jakarta.ejb.Stateless;

@Stateless
public class DemandeSansCompteVisionRepository extends GenericRepository<DemandeSansCompteVision, Long> {
    
    @Override
    protected Class<DemandeSansCompteVision> getEntityClass() {
        return DemandeSansCompteVision.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
