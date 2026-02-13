package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.AutorisationDematerialisation;
import jakarta.ejb.Stateless;

@Stateless
public class AutorisationDematerialisationRepository extends GenericRepository<AutorisationDematerialisation, Long> {
    
    @Override
    protected Class<AutorisationDematerialisation> getEntityClass() {
        return AutorisationDematerialisation.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
