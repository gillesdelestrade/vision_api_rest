package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CourrierDiffusionPVAG;
import jakarta.ejb.Stateless;

@Stateless
public class CourrierDiffusionPVAGRepository extends GenericRepository<CourrierDiffusionPVAG, Long> {
    
    @Override
    protected Class<CourrierDiffusionPVAG> getEntityClass() {
        return CourrierDiffusionPVAG.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
