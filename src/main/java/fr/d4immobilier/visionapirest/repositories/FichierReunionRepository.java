package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierReunion;
import jakarta.ejb.Stateless;

@Stateless
public class FichierReunionRepository extends GenericRepository<FichierReunion, Long> {
    
    @Override
    protected Class<FichierReunion> getEntityClass() {
        return FichierReunion.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
