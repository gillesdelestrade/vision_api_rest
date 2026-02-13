package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ComplementProcedure;
import jakarta.ejb.Stateless;

@Stateless
public class ComplementProcedureRepository extends GenericRepository<ComplementProcedure, Long> {
    
    @Override
    protected Class<ComplementProcedure> getEntityClass() {
        return ComplementProcedure.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
