package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ActionPVAG;
import jakarta.ejb.Stateless;

@Stateless
public class ActionPVAGRepository extends GenericRepository<ActionPVAG, Long> {
    
    @Override
    protected Class<ActionPVAG> getEntityClass() {
        return ActionPVAG.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
