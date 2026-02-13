package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Personne;
import jakarta.ejb.Stateless;

@Stateless
public class PersonneRepository extends GenericRepository<Personne, Long> {
    
    @Override
    protected Class<Personne> getEntityClass() {
        return Personne.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
