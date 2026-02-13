package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ReunionV2;
import jakarta.ejb.Stateless;

@Stateless
public class ReunionV2Repository extends GenericRepository<ReunionV2, Long> {
    
    @Override
    protected Class<ReunionV2> getEntityClass() {
        return ReunionV2.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
