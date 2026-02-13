package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ProchaineEtape;
import jakarta.ejb.Stateless;

@Stateless
public class ProchaineEtapeRepository extends GenericRepository<ProchaineEtape, Long> {
    
    @Override
    protected Class<ProchaineEtape> getEntityClass() {
        return ProchaineEtape.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
