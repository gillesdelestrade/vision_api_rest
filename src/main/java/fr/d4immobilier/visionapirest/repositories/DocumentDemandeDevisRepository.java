package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DocumentDemandeDevis;
import jakarta.ejb.Stateless;

@Stateless
public class DocumentDemandeDevisRepository extends GenericRepository<DocumentDemandeDevis, Long> {
    
    @Override
    protected Class<DocumentDemandeDevis> getEntityClass() {
        return DocumentDemandeDevis.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
