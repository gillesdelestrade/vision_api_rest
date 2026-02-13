package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CoproprietaireSociete;
import jakarta.ejb.Stateless;

@Stateless
public class CoproprietaireSocieteRepository extends GenericRepository<CoproprietaireSociete, Long> {
    
    @Override
    protected Class<CoproprietaireSociete> getEntityClass() {
        return CoproprietaireSociete.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
