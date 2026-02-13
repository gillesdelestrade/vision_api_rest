package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PrixCatalogue;
import jakarta.ejb.Stateless;

@Stateless
public class PrixCatalogueRepository extends GenericRepository<PrixCatalogue, Long> {
    
    @Override
    protected Class<PrixCatalogue> getEntityClass() {
        return PrixCatalogue.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
