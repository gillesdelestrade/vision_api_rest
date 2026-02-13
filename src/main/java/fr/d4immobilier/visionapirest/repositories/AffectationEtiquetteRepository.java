package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.AffectationEtiquette;
import jakarta.ejb.Stateless;

@Stateless
public class AffectationEtiquetteRepository extends GenericRepository<AffectationEtiquette, Long> {
    
    @Override
    protected Class<AffectationEtiquette> getEntityClass() {
        return AffectationEtiquette.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
