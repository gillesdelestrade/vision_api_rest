package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierPVAG;
import jakarta.ejb.Stateless;

@Stateless
public class FichierPVAGRepository extends GenericRepository<FichierPVAG, Long> {
    
    @Override
    protected Class<FichierPVAG> getEntityClass() {
        return FichierPVAG.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
