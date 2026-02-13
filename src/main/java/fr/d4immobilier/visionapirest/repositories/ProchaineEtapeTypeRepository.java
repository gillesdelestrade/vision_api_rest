package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ProchaineEtapeType;
import jakarta.ejb.Stateless;

@Stateless
public class ProchaineEtapeTypeRepository extends GenericRepository<ProchaineEtapeType, Long> {
    
    @Override
    protected Class<ProchaineEtapeType> getEntityClass() {
        return ProchaineEtapeType.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
