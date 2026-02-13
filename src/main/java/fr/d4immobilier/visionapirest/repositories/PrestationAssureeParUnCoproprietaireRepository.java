package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PrestationAssureeParUnCoproprietaire;
import jakarta.ejb.Stateless;

@Stateless
public class PrestationAssureeParUnCoproprietaireRepository extends GenericRepository<PrestationAssureeParUnCoproprietaire, Long> {
    
    @Override
    protected Class<PrestationAssureeParUnCoproprietaire> getEntityClass() {
        return PrestationAssureeParUnCoproprietaire.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
