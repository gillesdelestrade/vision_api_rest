package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Affectation;
import jakarta.ejb.Stateless;

@Stateless
public class AffectationRepository extends GenericRepository<Affectation, Long> {
    
    @Override
    protected Class<Affectation> getEntityClass() {
        return Affectation.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
