package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Locataire;
import jakarta.ejb.Stateless;

@Stateless
public class LocataireRepository extends GenericRepository<Locataire, Long> {
    
    @Override
    protected Class<Locataire> getEntityClass() {
        return Locataire.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
