package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.BonDeCommande;
import jakarta.ejb.Stateless;

@Stateless
public class BonDeCommandeRepository extends GenericRepository<BonDeCommande, Long> {
    
    @Override
    protected Class<BonDeCommande> getEntityClass() {
        return BonDeCommande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
