package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EmplacementStock;
import jakarta.ejb.Stateless;

@Stateless
public class EmplacementStockRepository extends GenericRepository<EmplacementStock, Long> {
    
    @Override
    protected Class<EmplacementStock> getEntityClass() {
        return EmplacementStock.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
