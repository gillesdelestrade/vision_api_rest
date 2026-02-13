package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.TypeDocumentCourrierEntrant;
import jakarta.ejb.Stateless;

@Stateless
public class TypeDocumentCourrierEntrantRepository extends GenericRepository<TypeDocumentCourrierEntrant, Long> {
    
    @Override
    protected Class<TypeDocumentCourrierEntrant> getEntityClass() {
        return TypeDocumentCourrierEntrant.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
