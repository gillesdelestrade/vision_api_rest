package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Vote;
import jakarta.ejb.Stateless;

@Stateless
public class VoteRepository extends GenericRepository<Vote, Long> {
    
    @Override
    protected Class<Vote> getEntityClass() {
        return Vote.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
