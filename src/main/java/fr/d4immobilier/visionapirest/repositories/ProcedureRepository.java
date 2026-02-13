package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Procedure;
import jakarta.ejb.Stateless;

@Stateless
public class ProcedureRepository extends GenericRepository<Procedure, Long> {
    
    @Override
    protected Class<Procedure> getEntityClass() {
        return Procedure.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
