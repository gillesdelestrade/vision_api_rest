package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CampagneADF;
import jakarta.ejb.Stateless;

@Stateless
public class CampagneADFRepository extends GenericRepository<CampagneADF, Long> {
    
    @Override
    protected Class<CampagneADF> getEntityClass() {
        return CampagneADF.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
