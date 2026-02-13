package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ARappeler;
import jakarta.ejb.Stateless;

@Stateless
public class ARappelerRepository extends GenericRepository<ARappeler, Long> {
    
    @Override
    protected Class<ARappeler> getEntityClass() {
        return ARappeler.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
