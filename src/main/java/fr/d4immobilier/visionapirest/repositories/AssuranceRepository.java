package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Assurance;
import jakarta.ejb.Stateless;

@Stateless
public class AssuranceRepository extends GenericRepository<Assurance, Long> {
    
    @Override
    protected Class<Assurance> getEntityClass() {
        return Assurance.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
