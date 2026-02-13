package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MotNonPertinent;
import jakarta.ejb.Stateless;

@Stateless
public class MotNonPertinentRepository extends GenericRepository<MotNonPertinent, Long> {
    
    @Override
    protected Class<MotNonPertinent> getEntityClass() {
        return MotNonPertinent.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
