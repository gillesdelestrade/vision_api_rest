package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Audience;
import jakarta.ejb.Stateless;

@Stateless
public class AudienceRepository extends GenericRepository<Audience, Long> {
    
    @Override
    protected Class<Audience> getEntityClass() {
        return Audience.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
