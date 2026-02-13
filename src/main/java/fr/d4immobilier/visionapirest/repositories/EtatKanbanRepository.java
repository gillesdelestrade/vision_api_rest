package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EtatKanban;
import jakarta.ejb.Stateless;

@Stateless
public class EtatKanbanRepository extends GenericRepository<EtatKanban, Long> {
    
    @Override
    protected Class<EtatKanban> getEntityClass() {
        return EtatKanban.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
