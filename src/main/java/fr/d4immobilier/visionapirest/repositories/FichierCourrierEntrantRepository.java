package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierCourrierEntrant;
import jakarta.ejb.Stateless;

@Stateless
public class FichierCourrierEntrantRepository extends GenericRepository<FichierCourrierEntrant, Long> {
    
    @Override
    protected Class<FichierCourrierEntrant> getEntityClass() {
        return FichierCourrierEntrant.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
