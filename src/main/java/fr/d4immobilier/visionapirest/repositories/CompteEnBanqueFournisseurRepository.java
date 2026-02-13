package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CompteEnBanqueFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class CompteEnBanqueFournisseurRepository extends GenericRepository<CompteEnBanqueFournisseur, Long> {
    
    @Override
    protected Class<CompteEnBanqueFournisseur> getEntityClass() {
        return CompteEnBanqueFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
