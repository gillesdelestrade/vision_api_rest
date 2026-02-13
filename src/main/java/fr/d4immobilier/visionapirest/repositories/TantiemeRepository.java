package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Tantieme;
import jakarta.ejb.Stateless;

@Stateless
public class TantiemeRepository extends GenericRepository<Tantieme, Long> {
    
    @Override
    protected Class<Tantieme> getEntityClass() {
        return Tantieme.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
