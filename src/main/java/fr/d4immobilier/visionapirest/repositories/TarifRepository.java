package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Tarif;
import jakarta.ejb.Stateless;

@Stateless
public class TarifRepository extends GenericRepository<Tarif, Long> {
    
    @Override
    protected Class<Tarif> getEntityClass() {
        return Tarif.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
