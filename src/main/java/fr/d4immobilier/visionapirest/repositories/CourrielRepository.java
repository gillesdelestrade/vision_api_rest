package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Courriel;
import jakarta.ejb.Stateless;

@Stateless
public class CourrielRepository extends GenericRepository<Courriel, Long> {
    
    @Override
    protected Class<Courriel> getEntityClass() {
        return Courriel.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
