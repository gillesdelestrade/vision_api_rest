package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.JournalEtatKanban;
import jakarta.ejb.Stateless;

@Stateless
public class JournalEtatKanbanRepository extends GenericRepository<JournalEtatKanban, Long> {
    
    @Override
    protected Class<JournalEtatKanban> getEntityClass() {
        return JournalEtatKanban.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
