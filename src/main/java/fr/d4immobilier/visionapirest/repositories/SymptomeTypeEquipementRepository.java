package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.SymptomeTypeEquipement;
import jakarta.ejb.Stateless;

@Stateless
public class SymptomeTypeEquipementRepository extends GenericRepository<SymptomeTypeEquipement, Long> {
    
    @Override
    protected Class<SymptomeTypeEquipement> getEntityClass() {
        return SymptomeTypeEquipement.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
