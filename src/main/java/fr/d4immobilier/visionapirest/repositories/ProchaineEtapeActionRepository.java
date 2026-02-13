package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ProchaineEtapeAction;
import jakarta.ejb.Stateless;

@Stateless
public class ProchaineEtapeActionRepository extends GenericRepository<ProchaineEtapeAction, Long> {
    
    @Override
    protected Class<ProchaineEtapeAction> getEntityClass() {
        return ProchaineEtapeAction.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
