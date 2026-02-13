package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.BonDeCommandeEmplacementBALInterphone;
import jakarta.ejb.Stateless;

@Stateless
public class BonDeCommandeEmplacementBALInterphoneRepository extends GenericRepository<BonDeCommandeEmplacementBALInterphone, Long> {
    
    @Override
    protected Class<BonDeCommandeEmplacementBALInterphone> getEntityClass() {
        return BonDeCommandeEmplacementBALInterphone.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
