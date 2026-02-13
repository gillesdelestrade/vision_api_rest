package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FactureD4;
import jakarta.ejb.Stateless;

@Stateless
public class FactureD4Repository extends GenericRepository<FactureD4, Long> {
    
    @Override
    protected Class<FactureD4> getEntityClass() {
        return FactureD4.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
