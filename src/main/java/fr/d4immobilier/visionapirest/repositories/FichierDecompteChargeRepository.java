package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FichierDecompteCharge;
import jakarta.ejb.Stateless;

@Stateless
public class FichierDecompteChargeRepository extends GenericRepository<FichierDecompteCharge, Long> {
    
    @Override
    protected Class<FichierDecompteCharge> getEntityClass() {
        return FichierDecompteCharge.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
