package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EvaluationFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class EvaluationFournisseurRepository extends GenericRepository<EvaluationFournisseur, Long> {
    
    @Override
    protected Class<EvaluationFournisseur> getEntityClass() {
        return EvaluationFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
