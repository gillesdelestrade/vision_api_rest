package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Fournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class FournisseurRepository extends GenericRepository<Fournisseur, Long> {
    
    @Override
    protected Class<Fournisseur> getEntityClass() {
        return Fournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
