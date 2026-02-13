package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Sinistre;
import jakarta.ejb.Stateless;

@Stateless
public class SinistreRepository extends GenericRepository<Sinistre, Long> {
    
    @Override
    protected Class<Sinistre> getEntityClass() {
        return Sinistre.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
