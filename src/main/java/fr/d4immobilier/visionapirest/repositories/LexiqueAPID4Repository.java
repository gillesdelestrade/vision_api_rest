package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.LexiqueAPID4;
import jakarta.ejb.Stateless;

@Stateless
public class LexiqueAPID4Repository extends GenericRepository<LexiqueAPID4, Long> {
    
    @Override
    protected Class<LexiqueAPID4> getEntityClass() {
        return LexiqueAPID4.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
