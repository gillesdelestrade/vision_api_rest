package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.SessionTraitementADF;
import jakarta.ejb.Stateless;

@Stateless
public class SessionTraitementADFRepository extends GenericRepository<SessionTraitementADF, Long> {
    
    @Override
    protected Class<SessionTraitementADF> getEntityClass() {
        return SessionTraitementADF.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
