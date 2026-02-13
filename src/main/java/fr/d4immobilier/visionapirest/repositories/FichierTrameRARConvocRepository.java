package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierTrameRARConvoc;
import jakarta.ejb.Stateless;

@Stateless
public class FichierTrameRARConvocRepository extends GenericRepository<FichierTrameRARConvoc, Long> {
    
    @Override
    protected Class<FichierTrameRARConvoc> getEntityClass() {
        return FichierTrameRARConvoc.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
