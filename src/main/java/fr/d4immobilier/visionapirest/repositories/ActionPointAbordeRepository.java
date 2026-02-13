package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ActionPointAborde;
import jakarta.ejb.Stateless;

@Stateless
public class ActionPointAbordeRepository extends GenericRepository<ActionPointAborde, Long> {
    
    @Override
    protected Class<ActionPointAborde> getEntityClass() {
        return ActionPointAborde.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
