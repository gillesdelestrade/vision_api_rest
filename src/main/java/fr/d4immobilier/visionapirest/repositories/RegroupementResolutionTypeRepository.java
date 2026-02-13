package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.RegroupementResolutionType;
import jakarta.ejb.Stateless;

@Stateless
public class RegroupementResolutionTypeRepository extends GenericRepository<RegroupementResolutionType, Long> {
    
    @Override
    protected Class<RegroupementResolutionType> getEntityClass() {
        return RegroupementResolutionType.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
