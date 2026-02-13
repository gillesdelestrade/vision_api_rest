package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ProduitCatalogue;
import jakarta.ejb.Stateless;

@Stateless
public class ProduitCatalogueRepository extends GenericRepository<ProduitCatalogue, Long> {
    
    @Override
    protected Class<ProduitCatalogue> getEntityClass() {
        return ProduitCatalogue.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
