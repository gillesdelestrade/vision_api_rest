package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierDevisFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class FichierDevisFournisseurRepository extends GenericRepository<FichierDevisFournisseur, Long> {
    
    @Override
    protected Class<FichierDevisFournisseur> getEntityClass() {
        return FichierDevisFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
