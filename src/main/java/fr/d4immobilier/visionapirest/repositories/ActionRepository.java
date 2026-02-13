package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Action;
import jakarta.ejb.Stateless;

@Stateless
public class ActionRepository extends GenericRepository<Action, Long> {
    
    @Override
    protected Class<Action> getEntityClass() {
        return Action.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
