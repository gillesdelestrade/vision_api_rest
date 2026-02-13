package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.FactureFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class FactureFournisseurRepository extends GenericRepository<FactureFournisseur, Long> {
    
    @Override
    protected Class<FactureFournisseur> getEntityClass() {
        return FactureFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
