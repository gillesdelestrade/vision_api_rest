package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ProchaineEtapeDemande;
import jakarta.ejb.Stateless;

@Stateless
public class ProchaineEtapeDemandeRepository extends GenericRepository<ProchaineEtapeDemande, Long> {
    
    @Override
    protected Class<ProchaineEtapeDemande> getEntityClass() {
        return ProchaineEtapeDemande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
