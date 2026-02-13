package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PointAborde;
import jakarta.ejb.Stateless;

@Stateless
public class PointAbordeRepository extends GenericRepository<PointAborde, Long> {
    
    @Override
    protected Class<PointAborde> getEntityClass() {
        return PointAborde.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
