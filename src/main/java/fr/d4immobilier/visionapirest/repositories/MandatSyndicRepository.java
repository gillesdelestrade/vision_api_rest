package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MandatSyndic;
import jakarta.ejb.Stateless;

@Stateless
public class MandatSyndicRepository extends GenericRepository<MandatSyndic, Long> {
    
    @Override
    protected Class<MandatSyndic> getEntityClass() {
        return MandatSyndic.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
