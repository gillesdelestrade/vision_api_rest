package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.BonDeCommandePanierMoyenAcces;
import jakarta.ejb.Stateless;

@Stateless
public class BonDeCommandePanierMoyenAccesRepository extends GenericRepository<BonDeCommandePanierMoyenAcces, Long> {
    
    @Override
    protected Class<BonDeCommandePanierMoyenAcces> getEntityClass() {
        return BonDeCommandePanierMoyenAcces.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
