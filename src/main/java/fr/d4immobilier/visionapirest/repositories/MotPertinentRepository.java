package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MotPertinent;
import jakarta.ejb.Stateless;

@Stateless
public class MotPertinentRepository extends GenericRepository<MotPertinent, Long> {
    
    @Override
    protected Class<MotPertinent> getEntityClass() {
        return MotPertinent.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
