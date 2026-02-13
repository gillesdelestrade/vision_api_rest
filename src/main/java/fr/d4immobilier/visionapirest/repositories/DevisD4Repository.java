package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DevisD4;
import jakarta.ejb.Stateless;

@Stateless
public class DevisD4Repository extends GenericRepository<DevisD4, Long> {
    
    @Override
    protected Class<DevisD4> getEntityClass() {
        return DevisD4.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
