package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EmplacementPanneauBALInterphone;
import jakarta.ejb.Stateless;

@Stateless
public class EmplacementPanneauBALInterphoneRepository extends GenericRepository<EmplacementPanneauBALInterphone, Long> {
    
    @Override
    protected Class<EmplacementPanneauBALInterphone> getEntityClass() {
        return EmplacementPanneauBALInterphone.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
