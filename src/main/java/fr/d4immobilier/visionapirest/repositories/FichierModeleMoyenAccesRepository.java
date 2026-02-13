package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierModeleMoyenAcces;
import jakarta.ejb.Stateless;

@Stateless
public class FichierModeleMoyenAccesRepository extends GenericRepository<FichierModeleMoyenAcces, Long> {
    
    @Override
    protected Class<FichierModeleMoyenAcces> getEntityClass() {
        return FichierModeleMoyenAcces.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
