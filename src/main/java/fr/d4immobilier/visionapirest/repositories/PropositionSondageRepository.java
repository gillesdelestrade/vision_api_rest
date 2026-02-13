package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PropositionSondage;
import jakarta.ejb.Stateless;

@Stateless
public class PropositionSondageRepository extends GenericRepository<PropositionSondage, Long> {
    
    @Override
    protected Class<PropositionSondage> getEntityClass() {
        return PropositionSondage.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
