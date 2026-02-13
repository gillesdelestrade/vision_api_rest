package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierDemandeDevisFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class FichierDemandeDevisFournisseurRepository extends GenericRepository<FichierDemandeDevisFournisseur, Long> {
    
    @Override
    protected Class<FichierDemandeDevisFournisseur> getEntityClass() {
        return FichierDemandeDevisFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
