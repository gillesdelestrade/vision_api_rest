package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PartChequeCoproprietaire;
import jakarta.ejb.Stateless;

@Stateless
public class PartChequeCoproprietaireRepository extends GenericRepository<PartChequeCoproprietaire, Long> {
    
    @Override
    protected Class<PartChequeCoproprietaire> getEntityClass() {
        return PartChequeCoproprietaire.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
