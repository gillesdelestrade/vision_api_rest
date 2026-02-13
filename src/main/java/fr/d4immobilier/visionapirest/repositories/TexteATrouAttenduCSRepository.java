package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.TexteATrouAttenduCS;
import jakarta.ejb.Stateless;

@Stateless
public class TexteATrouAttenduCSRepository extends GenericRepository<TexteATrouAttenduCS, Long> {
    
    @Override
    protected Class<TexteATrouAttenduCS> getEntityClass() {
        return TexteATrouAttenduCS.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
