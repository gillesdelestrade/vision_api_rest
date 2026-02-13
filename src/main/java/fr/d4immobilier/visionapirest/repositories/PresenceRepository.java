package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Presence;
import jakarta.ejb.Stateless;

@Stateless
public class PresenceRepository extends GenericRepository<Presence, Long> {
    
    @Override
    protected Class<Presence> getEntityClass() {
        return Presence.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
