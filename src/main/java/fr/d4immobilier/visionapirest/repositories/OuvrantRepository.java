package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Ouvrant;
import jakarta.ejb.Stateless;

@Stateless
public class OuvrantRepository extends GenericRepository<Ouvrant, Long> {
    
    @Override
    protected Class<Ouvrant> getEntityClass() {
        return Ouvrant.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
