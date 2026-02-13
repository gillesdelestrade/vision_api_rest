package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.OptionTravaux;
import jakarta.ejb.Stateless;

@Stateless
public class OptionTravauxRepository extends GenericRepository<OptionTravaux, Long> {
    
    @Override
    protected Class<OptionTravaux> getEntityClass() {
        return OptionTravaux.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
