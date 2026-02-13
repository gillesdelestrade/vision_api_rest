package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierEmplacement;
import jakarta.ejb.Stateless;

@Stateless
public class FichierEmplacementRepository extends GenericRepository<FichierEmplacement, Long> {
    
    @Override
    protected Class<FichierEmplacement> getEntityClass() {
        return FichierEmplacement.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
