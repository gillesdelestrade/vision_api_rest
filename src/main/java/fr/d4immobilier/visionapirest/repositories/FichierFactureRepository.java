package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierFacture;
import jakarta.ejb.Stateless;

@Stateless
public class FichierFactureRepository extends GenericRepository<FichierFacture, Long> {
    
    @Override
    protected Class<FichierFacture> getEntityClass() {
        return FichierFacture.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
