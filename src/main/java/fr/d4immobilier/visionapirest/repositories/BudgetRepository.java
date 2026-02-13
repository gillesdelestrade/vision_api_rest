package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Budget;
import jakarta.ejb.Stateless;

@Stateless
public class BudgetRepository extends GenericRepository<Budget, Long> {
    
    @Override
    protected Class<Budget> getEntityClass() {
        return Budget.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
