package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogueQuantite;
import jakarta.ejb.Stateless;

@Stateless
public class MoyenAccesCatalogueQuantiteRepository extends GenericRepository<MoyenAccesCatalogueQuantite, Long> {
    
    @Override
    protected Class<MoyenAccesCatalogueQuantite> getEntityClass() {
        return MoyenAccesCatalogueQuantite.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
