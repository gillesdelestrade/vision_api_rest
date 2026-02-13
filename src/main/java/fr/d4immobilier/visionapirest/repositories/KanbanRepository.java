package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Kanban;
import jakarta.ejb.Stateless;

@Stateless
public class KanbanRepository extends GenericRepository<Kanban, Long> {
    
    @Override
    protected Class<Kanban> getEntityClass() {
        return Kanban.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
