package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DocumentBonDeCommande;
import jakarta.ejb.Stateless;

@Stateless
public class DocumentBonDeCommandeRepository extends GenericRepository<DocumentBonDeCommande, Long> {
    
    @Override
    protected Class<DocumentBonDeCommande> getEntityClass() {
        return DocumentBonDeCommande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
