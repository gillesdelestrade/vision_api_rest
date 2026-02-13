package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Agence;
import jakarta.ejb.Stateless;

@Stateless
public class AgenceRepository extends GenericRepository<Agence, Long> {
    
    @Override
    protected Class<Agence> getEntityClass() {
        return Agence.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
