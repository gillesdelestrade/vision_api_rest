package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.AttenduCS;
import jakarta.ejb.Stateless;

@Stateless
public class AttenduCSRepository extends GenericRepository<AttenduCS, Long> {
    
    @Override
    protected Class<AttenduCS> getEntityClass() {
        return AttenduCS.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
