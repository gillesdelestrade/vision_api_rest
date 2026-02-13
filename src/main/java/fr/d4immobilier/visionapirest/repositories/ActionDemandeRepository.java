package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ActionDemande;
import jakarta.ejb.Stateless;

@Stateless
public class ActionDemandeRepository extends GenericRepository<ActionDemande, Long> {
    
    @Override
    protected Class<ActionDemande> getEntityClass() {
        return ActionDemande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
