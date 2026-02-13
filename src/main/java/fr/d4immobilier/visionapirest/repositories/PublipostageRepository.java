package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Publipostage;
import jakarta.ejb.Stateless;

@Stateless
public class PublipostageRepository extends GenericRepository<Publipostage, Long> {
    
    @Override
    protected Class<Publipostage> getEntityClass() {
        return Publipostage.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
