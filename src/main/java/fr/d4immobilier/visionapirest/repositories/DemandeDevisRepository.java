package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DemandeDevis;
import jakarta.ejb.Stateless;

@Stateless
public class DemandeDevisRepository extends GenericRepository<DemandeDevis, Long> {
    
    @Override
    protected Class<DemandeDevis> getEntityClass() {
        return DemandeDevis.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
