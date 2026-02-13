package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Societe;
import jakarta.ejb.Stateless;

@Stateless
public class SocieteRepository extends GenericRepository<Societe, Long> {
    
    @Override
    protected Class<Societe> getEntityClass() {
        return Societe.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
