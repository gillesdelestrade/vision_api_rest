package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Courrier;
import jakarta.ejb.Stateless;

@Stateless
public class CourrierRepository extends GenericRepository<Courrier, Long> {
    
    @Override
    protected Class<Courrier> getEntityClass() {
        return Courrier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
