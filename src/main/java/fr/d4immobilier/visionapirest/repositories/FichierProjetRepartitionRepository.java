package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierProjetRepartition;
import jakarta.ejb.Stateless;

@Stateless
public class FichierProjetRepartitionRepository extends GenericRepository<FichierProjetRepartition, Long> {
    
    @Override
    protected Class<FichierProjetRepartition> getEntityClass() {
        return FichierProjetRepartition.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
