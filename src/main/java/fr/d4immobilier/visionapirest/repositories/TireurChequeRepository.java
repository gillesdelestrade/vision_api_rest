package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.TireurCheque;
import jakarta.ejb.Stateless;

@Stateless
public class TireurChequeRepository extends GenericRepository<TireurCheque, Long> {
    
    @Override
    protected Class<TireurCheque> getEntityClass() {
        return TireurCheque.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
