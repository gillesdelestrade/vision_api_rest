package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DocumentBonDeLivraison;
import jakarta.ejb.Stateless;

@Stateless
public class DocumentBonDeLivraisonRepository extends GenericRepository<DocumentBonDeLivraison, Long> {
    
    @Override
    protected Class<DocumentBonDeLivraison> getEntityClass() {
        return DocumentBonDeLivraison.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
