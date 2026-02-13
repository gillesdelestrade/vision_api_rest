package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Equipement;
import jakarta.ejb.Stateless;

@Stateless
public class EquipementRepository extends GenericRepository<Equipement, Long> {
    
    @Override
    protected Class<Equipement> getEntityClass() {
        return Equipement.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
