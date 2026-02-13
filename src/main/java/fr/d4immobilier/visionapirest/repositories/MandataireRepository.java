package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Mandataire;
import jakarta.ejb.Stateless;

@Stateless
public class MandataireRepository extends GenericRepository<Mandataire, Long> {
    
    @Override
    protected Class<Mandataire> getEntityClass() {
        return Mandataire.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
