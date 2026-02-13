package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FinancementTravaux;
import jakarta.ejb.Stateless;

@Stateless
public class FinancementTravauxRepository extends GenericRepository<FinancementTravaux, Long> {
    
    @Override
    protected Class<FinancementTravaux> getEntityClass() {
        return FinancementTravaux.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
