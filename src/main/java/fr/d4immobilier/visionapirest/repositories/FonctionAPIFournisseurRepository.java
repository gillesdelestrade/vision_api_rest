package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FonctionAPIFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class FonctionAPIFournisseurRepository extends GenericRepository<FonctionAPIFournisseur, Long> {
    
    @Override
    protected Class<FonctionAPIFournisseur> getEntityClass() {
        return FonctionAPIFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
