package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.TagEvenement;
import jakarta.ejb.Stateless;

@Stateless
public class TagEvenementRepository extends GenericRepository<TagEvenement, Long> {
    
    @Override
    protected Class<TagEvenement> getEntityClass() {
        return TagEvenement.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
