package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.TVA;
import jakarta.ejb.Stateless;

@Stateless
public class TVARepository extends GenericRepository<TVA, Long> {
    
    @Override
    protected Class<TVA> getEntityClass() {
        return TVA.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
