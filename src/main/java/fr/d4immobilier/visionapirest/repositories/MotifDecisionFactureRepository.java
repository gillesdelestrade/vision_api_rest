package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MotifDecisionFacture;
import jakarta.ejb.Stateless;

@Stateless
public class MotifDecisionFactureRepository extends GenericRepository<MotifDecisionFacture, Long> {
    
    @Override
    protected Class<MotifDecisionFacture> getEntityClass() {
        return MotifDecisionFacture.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
