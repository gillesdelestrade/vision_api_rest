package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.HonorairesSurTravaux;
import jakarta.ejb.Stateless;

@Stateless
public class HonorairesSurTravauxRepository extends GenericRepository<HonorairesSurTravaux, Long> {
    
    @Override
    protected Class<HonorairesSurTravaux> getEntityClass() {
        return HonorairesSurTravaux.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
