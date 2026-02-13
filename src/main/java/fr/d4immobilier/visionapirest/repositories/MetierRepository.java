package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Metier;
import jakarta.ejb.Stateless;

@Stateless
public class MetierRepository extends GenericRepository<Metier, Long> {
    
    @Override
    protected Class<Metier> getEntityClass() {
        return Metier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
