package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierInterventionDemande;
import jakarta.ejb.Stateless;

@Stateless
public class FichierInterventionDemandeRepository extends GenericRepository<FichierInterventionDemande, Long> {
    
    @Override
    protected Class<FichierInterventionDemande> getEntityClass() {
        return FichierInterventionDemande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
