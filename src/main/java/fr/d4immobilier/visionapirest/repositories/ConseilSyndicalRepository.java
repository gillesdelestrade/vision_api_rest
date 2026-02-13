package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ConseilSyndical;
import jakarta.ejb.Stateless;

@Stateless
public class ConseilSyndicalRepository extends GenericRepository<ConseilSyndical, Long> {
    
    @Override
    protected Class<ConseilSyndical> getEntityClass() {
        return ConseilSyndical.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
