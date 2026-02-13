package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PassageOblige;
import jakarta.ejb.Stateless;

@Stateless
public class PassageObligeRepository extends GenericRepository<PassageOblige, Long> {
    
    @Override
    protected Class<PassageOblige> getEntityClass() {
        return PassageOblige.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
