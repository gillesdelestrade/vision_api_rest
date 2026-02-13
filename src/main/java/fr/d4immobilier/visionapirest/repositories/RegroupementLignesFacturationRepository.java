package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.RegroupementLignesFacturation;
import jakarta.ejb.Stateless;

@Stateless
public class RegroupementLignesFacturationRepository extends GenericRepository<RegroupementLignesFacturation, Long> {
    
    @Override
    protected Class<RegroupementLignesFacturation> getEntityClass() {
        return RegroupementLignesFacturation.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
