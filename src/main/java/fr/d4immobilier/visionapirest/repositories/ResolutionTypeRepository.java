package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ResolutionType;
import jakarta.ejb.Stateless;

@Stateless
public class ResolutionTypeRepository extends GenericRepository<ResolutionType, Long> {
    
    @Override
    protected Class<ResolutionType> getEntityClass() {
        return ResolutionType.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
