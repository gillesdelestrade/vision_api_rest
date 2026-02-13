package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EtapePlanifAGModele;
import jakarta.ejb.Stateless;

@Stateless
public class EtapePlanifAGModeleRepository extends GenericRepository<EtapePlanifAGModele, Long> {
    
    @Override
    protected Class<EtapePlanifAGModele> getEntityClass() {
        return EtapePlanifAGModele.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
