package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CourrierFacture;
import jakarta.ejb.Stateless;

@Stateless
public class CourrierFactureRepository extends GenericRepository<CourrierFacture, Long> {
    
    @Override
    protected Class<CourrierFacture> getEntityClass() {
        return CourrierFacture.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
