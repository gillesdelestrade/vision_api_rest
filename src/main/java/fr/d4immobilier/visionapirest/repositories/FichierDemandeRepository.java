package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierDemande;
import jakarta.ejb.Stateless;

@Stateless
public class FichierDemandeRepository extends GenericRepository<FichierDemande, Long> {
    
    @Override
    protected Class<FichierDemande> getEntityClass() {
        return FichierDemande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
