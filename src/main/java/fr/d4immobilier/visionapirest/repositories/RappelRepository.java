package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Rappel;
import jakarta.ejb.Stateless;

@Stateless
public class RappelRepository extends GenericRepository<Rappel, Long> {
    
    @Override
    protected Class<Rappel> getEntityClass() {
        return Rappel.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
