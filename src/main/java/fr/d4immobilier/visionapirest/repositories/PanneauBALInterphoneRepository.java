package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PanneauBALInterphone;
import jakarta.ejb.Stateless;

@Stateless
public class PanneauBALInterphoneRepository extends GenericRepository<PanneauBALInterphone, Long> {
    
    @Override
    protected Class<PanneauBALInterphone> getEntityClass() {
        return PanneauBALInterphone.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
