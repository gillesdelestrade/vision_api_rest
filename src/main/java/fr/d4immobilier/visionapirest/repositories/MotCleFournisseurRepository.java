package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MotCleFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class MotCleFournisseurRepository extends GenericRepository<MotCleFournisseur, Long> {
    
    @Override
    protected Class<MotCleFournisseur> getEntityClass() {
        return MotCleFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
