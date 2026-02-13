package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Gestionnaire;
import jakarta.ejb.Stateless;

@Stateless
public class GestionnaireRepository extends GenericRepository<Gestionnaire, Long> {
    
    @Override
    protected Class<Gestionnaire> getEntityClass() {
        return Gestionnaire.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
