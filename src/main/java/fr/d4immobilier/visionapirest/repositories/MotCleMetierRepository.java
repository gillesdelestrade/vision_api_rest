package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MotCleMetier;
import jakarta.ejb.Stateless;

@Stateless
public class MotCleMetierRepository extends GenericRepository<MotCleMetier, Long> {
    
    @Override
    protected Class<MotCleMetier> getEntityClass() {
        return MotCleMetier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
