package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CandidatureCS;
import jakarta.ejb.Stateless;

@Stateless
public class CandidatureCSRepository extends GenericRepository<CandidatureCS, Long> {
    
    @Override
    protected Class<CandidatureCS> getEntityClass() {
        return CandidatureCS.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
