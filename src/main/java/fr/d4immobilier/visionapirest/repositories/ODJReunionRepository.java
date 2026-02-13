package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ODJReunion;
import jakarta.ejb.Stateless;

@Stateless
public class ODJReunionRepository extends GenericRepository<ODJReunion, Long> {
    
    @Override
    protected Class<ODJReunion> getEntityClass() {
        return ODJReunion.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
