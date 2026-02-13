package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.SuppressionFraisDeRelance;
import jakarta.ejb.Stateless;

@Stateless
public class SuppressionFraisDeRelanceRepository extends GenericRepository<SuppressionFraisDeRelance, Long> {
    
    @Override
    protected Class<SuppressionFraisDeRelance> getEntityClass() {
        return SuppressionFraisDeRelance.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
