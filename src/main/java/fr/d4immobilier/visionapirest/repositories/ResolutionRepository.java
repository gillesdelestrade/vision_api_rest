package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Resolution;
import jakarta.ejb.Stateless;

@Stateless
public class ResolutionRepository extends GenericRepository<Resolution, Long> {
    
    @Override
    protected Class<Resolution> getEntityClass() {
        return Resolution.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
