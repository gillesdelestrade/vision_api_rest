package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MandataireSociete;
import jakarta.ejb.Stateless;

@Stateless
public class MandataireSocieteRepository extends GenericRepository<MandataireSociete, Long> {
    
    @Override
    protected Class<MandataireSociete> getEntityClass() {
        return MandataireSociete.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
