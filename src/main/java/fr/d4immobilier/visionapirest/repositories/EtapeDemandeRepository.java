package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EtapeDemande;
import jakarta.ejb.Stateless;

@Stateless
public class EtapeDemandeRepository extends GenericRepository<EtapeDemande, Long> {
    
    @Override
    protected Class<EtapeDemande> getEntityClass() {
        return EtapeDemande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
