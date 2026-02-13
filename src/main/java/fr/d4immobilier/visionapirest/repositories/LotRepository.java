package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Lot;
import jakarta.ejb.Stateless;

@Stateless
public class LotRepository extends GenericRepository<Lot, Long> {
    
    @Override
    protected Class<Lot> getEntityClass() {
        return Lot.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
