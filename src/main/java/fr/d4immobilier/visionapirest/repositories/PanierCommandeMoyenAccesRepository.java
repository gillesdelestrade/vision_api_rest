package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PanierCommandeMoyenAcces;
import jakarta.ejb.Stateless;

@Stateless
public class PanierCommandeMoyenAccesRepository extends GenericRepository<PanierCommandeMoyenAcces, Long> {
    
    @Override
    protected Class<PanierCommandeMoyenAcces> getEntityClass() {
        return PanierCommandeMoyenAcces.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
