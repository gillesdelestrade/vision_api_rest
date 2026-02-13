package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ContratFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class ContratFournisseurRepository extends GenericRepository<ContratFournisseur, Long> {
    
    @Override
    protected Class<ContratFournisseur> getEntityClass() {
        return ContratFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
