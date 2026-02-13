package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CourrierEntrant;
import jakarta.ejb.Stateless;

@Stateless
public class CourrierEntrantRepository extends GenericRepository<CourrierEntrant, Long> {
    
    @Override
    protected Class<CourrierEntrant> getEntityClass() {
        return CourrierEntrant.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
