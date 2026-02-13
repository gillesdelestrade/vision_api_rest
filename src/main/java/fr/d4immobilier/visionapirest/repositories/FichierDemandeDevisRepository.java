package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierDemandeDevis;
import jakarta.ejb.Stateless;

@Stateless
public class FichierDemandeDevisRepository extends GenericRepository<FichierDemandeDevis, Long> {
    
    @Override
    protected Class<FichierDemandeDevis> getEntityClass() {
        return FichierDemandeDevis.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
