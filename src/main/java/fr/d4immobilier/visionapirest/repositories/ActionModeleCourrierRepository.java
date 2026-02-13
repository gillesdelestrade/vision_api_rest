package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ActionModeleCourrier;
import jakarta.ejb.Stateless;

@Stateless
public class ActionModeleCourrierRepository extends GenericRepository<ActionModeleCourrier, Long> {
    
    @Override
    protected Class<ActionModeleCourrier> getEntityClass() {
        return ActionModeleCourrier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
