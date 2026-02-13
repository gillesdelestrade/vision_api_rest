package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Fichier;
import jakarta.ejb.Stateless;

@Stateless
public class FichierRepository extends GenericRepository<Fichier, Long> {
    
    @Override
    protected Class<Fichier> getEntityClass() {
        return Fichier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
