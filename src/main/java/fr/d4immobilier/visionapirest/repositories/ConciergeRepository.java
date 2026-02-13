package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Concierge;
import jakarta.ejb.Stateless;

@Stateless
public class ConciergeRepository extends GenericRepository<Concierge, Long> {
    
    @Override
    protected Class<Concierge> getEntityClass() {
        return Concierge.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
