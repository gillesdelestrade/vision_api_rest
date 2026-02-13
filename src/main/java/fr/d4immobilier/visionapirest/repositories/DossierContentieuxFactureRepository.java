package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DossierContentieuxFacture;
import jakarta.ejb.Stateless;

@Stateless
public class DossierContentieuxFactureRepository extends GenericRepository<DossierContentieuxFacture, Long> {
    
    @Override
    protected Class<DossierContentieuxFacture> getEntityClass() {
        return DossierContentieuxFacture.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
