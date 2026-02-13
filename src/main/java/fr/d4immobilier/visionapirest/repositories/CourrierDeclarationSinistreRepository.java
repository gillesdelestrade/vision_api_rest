package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CourrierDeclarationSinistre;
import jakarta.ejb.Stateless;

@Stateless
public class CourrierDeclarationSinistreRepository extends GenericRepository<CourrierDeclarationSinistre, Long> {
    
    @Override
    protected Class<CourrierDeclarationSinistre> getEntityClass() {
        return CourrierDeclarationSinistre.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
