package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CommentaireDevisFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class CommentaireDevisFournisseurRepository extends GenericRepository<CommentaireDevisFournisseur, Long> {
    
    @Override
    protected Class<CommentaireDevisFournisseur> getEntityClass() {
        return CommentaireDevisFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
