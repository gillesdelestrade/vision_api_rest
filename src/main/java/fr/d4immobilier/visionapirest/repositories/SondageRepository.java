package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Sondage;
import jakarta.ejb.Stateless;

@Stateless
public class SondageRepository extends GenericRepository<Sondage, Long> {
    
    @Override
    protected Class<Sondage> getEntityClass() {
        return Sondage.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
