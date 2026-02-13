package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EvenementDemande;
import jakarta.ejb.Stateless;

@Stateless
public class EvenementDemandeRepository extends GenericRepository<EvenementDemande, Long> {
    
    @Override
    protected Class<EvenementDemande> getEntityClass() {
        return EvenementDemande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
