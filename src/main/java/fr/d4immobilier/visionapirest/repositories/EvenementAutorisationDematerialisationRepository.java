package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EvenementAutorisationDematerialisation;
import jakarta.ejb.Stateless;

@Stateless
public class EvenementAutorisationDematerialisationRepository extends GenericRepository<EvenementAutorisationDematerialisation, Long> {
    
    @Override
    protected Class<EvenementAutorisationDematerialisation> getEntityClass() {
        return EvenementAutorisationDematerialisation.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
