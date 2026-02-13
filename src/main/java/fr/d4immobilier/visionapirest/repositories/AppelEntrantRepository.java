package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.AppelEntrant;
import jakarta.ejb.Stateless;

@Stateless
public class AppelEntrantRepository extends GenericRepository<AppelEntrant, Long> {
    
    @Override
    protected Class<AppelEntrant> getEntityClass() {
        return AppelEntrant.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
