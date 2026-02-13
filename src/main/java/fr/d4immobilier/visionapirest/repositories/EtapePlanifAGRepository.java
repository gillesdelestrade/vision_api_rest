package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EtapePlanifAG;
import jakarta.ejb.Stateless;

@Stateless
public class EtapePlanifAGRepository extends GenericRepository<EtapePlanifAG, Long> {
    
    @Override
    protected Class<EtapePlanifAG> getEntityClass() {
        return EtapePlanifAG.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
