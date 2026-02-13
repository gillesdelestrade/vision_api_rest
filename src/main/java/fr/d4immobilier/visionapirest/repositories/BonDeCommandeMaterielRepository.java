package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.BonDeCommandeMateriel;
import jakarta.ejb.Stateless;

@Stateless
public class BonDeCommandeMaterielRepository extends GenericRepository<BonDeCommandeMateriel, Long> {
    
    @Override
    protected Class<BonDeCommandeMateriel> getEntityClass() {
        return BonDeCommandeMateriel.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
