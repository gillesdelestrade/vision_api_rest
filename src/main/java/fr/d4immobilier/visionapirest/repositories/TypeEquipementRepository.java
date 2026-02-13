package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.TypeEquipement;
import jakarta.ejb.Stateless;

@Stateless
public class TypeEquipementRepository extends GenericRepository<TypeEquipement, Long> {
    
    @Override
    protected Class<TypeEquipement> getEntityClass() {
        return TypeEquipement.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
