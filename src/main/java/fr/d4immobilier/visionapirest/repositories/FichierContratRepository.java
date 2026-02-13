package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierContrat;
import jakarta.ejb.Stateless;

@Stateless
public class FichierContratRepository extends GenericRepository<FichierContrat, Long> {
    
    @Override
    protected Class<FichierContrat> getEntityClass() {
        return FichierContrat.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
