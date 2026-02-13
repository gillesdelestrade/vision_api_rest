package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ModeleMoyenAcces;
import jakarta.ejb.Stateless;

@Stateless
public class ModeleMoyenAccesRepository extends GenericRepository<ModeleMoyenAcces, Long> {
    
    @Override
    protected Class<ModeleMoyenAcces> getEntityClass() {
        return ModeleMoyenAcces.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
