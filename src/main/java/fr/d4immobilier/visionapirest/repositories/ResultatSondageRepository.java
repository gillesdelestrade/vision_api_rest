package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ResultatSondage;
import jakarta.ejb.Stateless;

@Stateless
public class ResultatSondageRepository extends GenericRepository<ResultatSondage, Long> {
    
    @Override
    protected Class<ResultatSondage> getEntityClass() {
        return ResultatSondage.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
