package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.APIFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class APIFournisseurRepository extends GenericRepository<APIFournisseur, Long> {
    
    @Override
    protected Class<APIFournisseur> getEntityClass() {
        return APIFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
