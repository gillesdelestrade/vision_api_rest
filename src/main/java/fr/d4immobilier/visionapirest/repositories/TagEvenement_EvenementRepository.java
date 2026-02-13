package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.TagEvenement_Evenement;
import jakarta.ejb.Stateless;

@Stateless
public class TagEvenement_EvenementRepository extends GenericRepository<TagEvenement_Evenement, Long> {
    
    @Override
    protected Class<TagEvenement_Evenement> getEntityClass() {
        return TagEvenement_Evenement.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
