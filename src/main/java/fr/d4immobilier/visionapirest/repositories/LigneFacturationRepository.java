package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.LigneFacturation;
import jakarta.ejb.Stateless;

@Stateless
public class LigneFacturationRepository extends GenericRepository<LigneFacturation, Long> {
    
    @Override
    protected Class<LigneFacturation> getEntityClass() {
        return LigneFacturation.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
