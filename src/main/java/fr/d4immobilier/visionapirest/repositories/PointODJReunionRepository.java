package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PointODJReunion;
import jakarta.ejb.Stateless;

@Stateless
public class PointODJReunionRepository extends GenericRepository<PointODJReunion, Long> {
    
    @Override
    protected Class<PointODJReunion> getEntityClass() {
        return PointODJReunion.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
