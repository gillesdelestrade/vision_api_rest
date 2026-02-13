package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Syndic;
import jakarta.ejb.Stateless;

@Stateless
public class SyndicRepository extends GenericRepository<Syndic, Long> {
    
    @Override
    protected Class<Syndic> getEntityClass() {
        return Syndic.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
