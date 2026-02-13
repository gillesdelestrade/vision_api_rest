package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ResolutionTravaux;
import jakarta.ejb.Stateless;

@Stateless
public class ResolutionTravauxRepository extends GenericRepository<ResolutionTravaux, Long> {
    
    @Override
    protected Class<ResolutionTravaux> getEntityClass() {
        return ResolutionTravaux.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
