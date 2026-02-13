package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierDemandeSansCompteVision;
import jakarta.ejb.Stateless;

@Stateless
public class FichierDemandeSansCompteVisionRepository extends GenericRepository<FichierDemandeSansCompteVision, Long> {
    
    @Override
    protected Class<FichierDemandeSansCompteVision> getEntityClass() {
        return FichierDemandeSansCompteVision.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
