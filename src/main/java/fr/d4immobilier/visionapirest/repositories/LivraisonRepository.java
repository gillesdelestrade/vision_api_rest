package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Livraison;
import jakarta.ejb.Stateless;

@Stateless
public class LivraisonRepository extends GenericRepository<Livraison, Long> {
    
    @Override
    protected Class<Livraison> getEntityClass() {
        return Livraison.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
