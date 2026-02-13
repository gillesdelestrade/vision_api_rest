package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Document;
import jakarta.ejb.Stateless;

@Stateless
public class DocumentRepository extends GenericRepository<Document, Long> {
    
    @Override
    protected Class<Document> getEntityClass() {
        return Document.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
