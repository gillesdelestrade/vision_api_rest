package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.SurveillanceObjets;
import jakarta.ejb.Stateless;

@Stateless
public class SurveillanceObjetsRepository extends GenericRepository<SurveillanceObjets, Long> {
    
    @Override
    protected Class<SurveillanceObjets> getEntityClass() {
        return SurveillanceObjets.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
