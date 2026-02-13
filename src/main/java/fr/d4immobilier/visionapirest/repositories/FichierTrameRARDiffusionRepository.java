package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierTrameRARDiffusion;
import jakarta.ejb.Stateless;

@Stateless
public class FichierTrameRARDiffusionRepository extends GenericRepository<FichierTrameRARDiffusion, Long> {
    
    @Override
    protected Class<FichierTrameRARDiffusion> getEntityClass() {
        return FichierTrameRARDiffusion.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
