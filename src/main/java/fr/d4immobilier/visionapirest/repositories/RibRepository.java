package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Rib;
import jakarta.ejb.Stateless;

@Stateless
public class RibRepository extends GenericRepository<Rib, Long> {
    
    @Override
    protected Class<Rib> getEntityClass() {
        return Rib.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
