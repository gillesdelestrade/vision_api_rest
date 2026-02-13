package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PrestationContrat;
import jakarta.ejb.Stateless;

@Stateless
public class PrestationContratRepository extends GenericRepository<PrestationContrat, Long> {
    
    @Override
    protected Class<PrestationContrat> getEntityClass() {
        return PrestationContrat.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
