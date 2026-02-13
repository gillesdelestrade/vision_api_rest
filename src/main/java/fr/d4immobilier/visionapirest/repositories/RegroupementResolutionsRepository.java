package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.RegroupementResolutions;
import jakarta.ejb.Stateless;

@Stateless
public class RegroupementResolutionsRepository extends GenericRepository<RegroupementResolutions, Long> {
    
    @Override
    protected Class<RegroupementResolutions> getEntityClass() {
        return RegroupementResolutions.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
