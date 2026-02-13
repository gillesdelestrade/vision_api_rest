package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MoyenAcces;
import jakarta.ejb.Stateless;

@Stateless
public class MoyenAccesRepository extends GenericRepository<MoyenAcces, Long> {
    
    @Override
    protected Class<MoyenAcces> getEntityClass() {
        return MoyenAcces.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
