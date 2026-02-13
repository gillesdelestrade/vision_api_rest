package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DevisFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class DevisFournisseurRepository extends GenericRepository<DevisFournisseur, Long> {
    
    @Override
    protected Class<DevisFournisseur> getEntityClass() {
        return DevisFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
