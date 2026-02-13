package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.NoeudThreadCourrier;
import jakarta.ejb.Stateless;

@Stateless
public class NoeudThreadCourrierRepository extends GenericRepository<NoeudThreadCourrier, Long> {
    
    @Override
    protected Class<NoeudThreadCourrier> getEntityClass() {
        return NoeudThreadCourrier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
