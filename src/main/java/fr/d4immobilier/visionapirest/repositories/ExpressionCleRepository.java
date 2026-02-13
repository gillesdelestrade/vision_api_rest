package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ExpressionCle;
import jakarta.ejb.Stateless;

@Stateless
public class ExpressionCleRepository extends GenericRepository<ExpressionCle, Long> {
    
    @Override
    protected Class<ExpressionCle> getEntityClass() {
        return ExpressionCle.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
