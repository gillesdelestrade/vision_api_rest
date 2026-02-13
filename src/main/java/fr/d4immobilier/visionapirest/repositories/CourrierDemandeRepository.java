package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CourrierDemande;
import jakarta.ejb.Stateless;

@Stateless
public class CourrierDemandeRepository extends GenericRepository<CourrierDemande, Long> {
    
    @Override
    protected Class<CourrierDemande> getEntityClass() {
        return CourrierDemande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
