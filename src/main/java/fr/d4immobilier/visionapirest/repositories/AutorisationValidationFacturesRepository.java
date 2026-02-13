package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.AutorisationValidationFactures;
import jakarta.ejb.Stateless;

@Stateless
public class AutorisationValidationFacturesRepository extends GenericRepository<AutorisationValidationFactures, Long> {
    
    @Override
    protected Class<AutorisationValidationFactures> getEntityClass() {
        return AutorisationValidationFactures.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
