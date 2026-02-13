package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ThreadCourrier;
import jakarta.ejb.Stateless;

@Stateless
public class ThreadCourrierRepository extends GenericRepository<ThreadCourrier, Long> {
    
    @Override
    protected Class<ThreadCourrier> getEntityClass() {
        return ThreadCourrier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
