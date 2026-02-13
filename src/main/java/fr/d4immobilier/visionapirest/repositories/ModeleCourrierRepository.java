package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ModeleCourrier;
import jakarta.ejb.Stateless;

@Stateless
public class ModeleCourrierRepository extends GenericRepository<ModeleCourrier, Long> {
    
    @Override
    protected Class<ModeleCourrier> getEntityClass() {
        return ModeleCourrier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
