package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.TypeTantieme;
import jakarta.ejb.Stateless;

@Stateless
public class TypeTantiemeRepository extends GenericRepository<TypeTantieme, Long> {
    
    @Override
    protected Class<TypeTantieme> getEntityClass() {
        return TypeTantieme.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
