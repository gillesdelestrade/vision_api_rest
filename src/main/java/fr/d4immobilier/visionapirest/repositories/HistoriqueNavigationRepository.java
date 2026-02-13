package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.HistoriqueNavigation;
import jakarta.ejb.Stateless;

@Stateless
public class HistoriqueNavigationRepository extends GenericRepository<HistoriqueNavigation, Long> {
    
    @Override
    protected Class<HistoriqueNavigation> getEntityClass() {
        return HistoriqueNavigation.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
