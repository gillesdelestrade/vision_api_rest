package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PouvoirAG;
import jakarta.ejb.Stateless;

@Stateless
public class PouvoirAGRepository extends GenericRepository<PouvoirAG, Long> {
    
    @Override
    protected Class<PouvoirAG> getEntityClass() {
        return PouvoirAG.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
