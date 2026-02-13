package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.RappelCourrier;
import jakarta.ejb.Stateless;

@Stateless
public class RappelCourrierRepository extends GenericRepository<RappelCourrier, Long> {
    
    @Override
    protected Class<RappelCourrier> getEntityClass() {
        return RappelCourrier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
