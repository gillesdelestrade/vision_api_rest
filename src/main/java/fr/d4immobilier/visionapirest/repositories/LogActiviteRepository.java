package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.LogActivite;
import jakarta.ejb.Stateless;

@Stateless
public class LogActiviteRepository extends GenericRepository<LogActivite, Long> {
    
    @Override
    protected Class<LogActivite> getEntityClass() {
        return LogActivite.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
