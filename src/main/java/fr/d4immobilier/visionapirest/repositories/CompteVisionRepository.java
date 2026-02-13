package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CompteVision;
import jakarta.ejb.Stateless;

@Stateless
public class CompteVisionRepository extends GenericRepository<CompteVision, Long> {
    
    @Override
    protected Class<CompteVision> getEntityClass() {
        return CompteVision.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
