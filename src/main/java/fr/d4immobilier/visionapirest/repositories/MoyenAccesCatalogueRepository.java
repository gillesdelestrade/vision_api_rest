package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogue;
import jakarta.ejb.Stateless;

@Stateless
public class MoyenAccesCatalogueRepository extends GenericRepository<MoyenAccesCatalogue, Long> {
    
    @Override
    protected Class<MoyenAccesCatalogue> getEntityClass() {
        return MoyenAccesCatalogue.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
