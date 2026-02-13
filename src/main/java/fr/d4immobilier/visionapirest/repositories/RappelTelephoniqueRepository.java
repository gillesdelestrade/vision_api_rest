package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.RappelTelephonique;
import jakarta.ejb.Stateless;

@Stateless
public class RappelTelephoniqueRepository extends GenericRepository<RappelTelephonique, Long> {
    
    @Override
    protected Class<RappelTelephonique> getEntityClass() {
        return RappelTelephonique.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
