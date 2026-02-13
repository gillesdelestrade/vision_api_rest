package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierBonDeLivraison;
import jakarta.ejb.Stateless;

@Stateless
public class FichierBonDeLivraisonRepository extends GenericRepository<FichierBonDeLivraison, Long> {
    
    @Override
    protected Class<FichierBonDeLivraison> getEntityClass() {
        return FichierBonDeLivraison.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
