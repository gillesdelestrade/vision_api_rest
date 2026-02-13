package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Tag;
import jakarta.ejb.Stateless;

@Stateless
public class TagRepository extends GenericRepository<Tag, Long> {
    
    @Override
    protected Class<Tag> getEntityClass() {
        return Tag.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
