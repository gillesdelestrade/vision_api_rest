package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ARappelerCourrier;
import jakarta.ejb.Stateless;

@Stateless
public class ARappelerCourrierRepository extends GenericRepository<ARappelerCourrier, Long> {
    
    @Override
    protected Class<ARappelerCourrier> getEntityClass() {
        return ARappelerCourrier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
