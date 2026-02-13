package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Reunion;
import jakarta.ejb.Stateless;

@Stateless
public class ReunionRepository extends GenericRepository<Reunion, Long> {
    
    @Override
    protected Class<Reunion> getEntityClass() {
        return Reunion.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
