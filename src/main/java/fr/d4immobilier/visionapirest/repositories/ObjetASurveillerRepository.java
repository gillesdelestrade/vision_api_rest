package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ObjetASurveiller;
import jakarta.ejb.Stateless;

@Stateless
public class ObjetASurveillerRepository extends GenericRepository<ObjetASurveiller, Long> {
    
    @Override
    protected Class<ObjetASurveiller> getEntityClass() {
        return ObjetASurveiller.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
