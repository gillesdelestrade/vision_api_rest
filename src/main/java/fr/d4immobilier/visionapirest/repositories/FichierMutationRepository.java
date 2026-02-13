package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierMutation;
import jakarta.ejb.Stateless;

@Stateless
public class FichierMutationRepository extends GenericRepository<FichierMutation, Long> {
    
    @Override
    protected Class<FichierMutation> getEntityClass() {
        return FichierMutation.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
