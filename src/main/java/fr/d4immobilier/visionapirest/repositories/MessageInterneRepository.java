package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MessageInterne;
import jakarta.ejb.Stateless;

@Stateless
public class MessageInterneRepository extends GenericRepository<MessageInterne, Long> {
    
    @Override
    protected Class<MessageInterne> getEntityClass() {
        return MessageInterne.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
