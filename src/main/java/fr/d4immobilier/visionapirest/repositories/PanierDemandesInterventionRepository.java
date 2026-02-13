package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PanierDemandesIntervention;
import jakarta.ejb.Stateless;

@Stateless
public class PanierDemandesInterventionRepository extends GenericRepository<PanierDemandesIntervention, Long> {
    
    @Override
    protected Class<PanierDemandesIntervention> getEntityClass() {
        return PanierDemandesIntervention.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
