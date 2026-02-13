package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CommentaireFactureFournisseur;
import jakarta.ejb.Stateless;

@Stateless
public class CommentaireFactureFournisseurRepository extends GenericRepository<CommentaireFactureFournisseur, Long> {
    
    @Override
    protected Class<CommentaireFactureFournisseur> getEntityClass() {
        return CommentaireFactureFournisseur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
