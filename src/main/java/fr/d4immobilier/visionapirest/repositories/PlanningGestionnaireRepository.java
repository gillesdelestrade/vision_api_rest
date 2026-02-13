package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PlanningGestionnaire;
import jakarta.ejb.Stateless;

@Stateless
public class PlanningGestionnaireRepository extends GenericRepository<PlanningGestionnaire, Long> {
    
    @Override
    protected Class<PlanningGestionnaire> getEntityClass() {
        return PlanningGestionnaire.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
