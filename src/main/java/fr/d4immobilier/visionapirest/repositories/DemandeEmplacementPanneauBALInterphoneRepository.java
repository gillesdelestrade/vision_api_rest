package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DemandeEmplacementPanneauBALInterphone;
import jakarta.ejb.Stateless;

@Stateless
public class DemandeEmplacementPanneauBALInterphoneRepository extends GenericRepository<DemandeEmplacementPanneauBALInterphone, Long> {
    
    @Override
    protected Class<DemandeEmplacementPanneauBALInterphone> getEntityClass() {
        return DemandeEmplacementPanneauBALInterphone.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
