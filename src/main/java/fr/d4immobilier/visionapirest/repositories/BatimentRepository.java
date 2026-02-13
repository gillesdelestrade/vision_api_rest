package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Batiment;
import jakarta.ejb.Stateless;

@Stateless
public class BatimentRepository extends GenericRepository<Batiment, Long> {
    
    @Override
    protected Class<Batiment> getEntityClass() {
        return Batiment.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
