package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.JournalEtatKanbanDTO;
import fr.d4immobilier.visionapirest.entities.JournalEtatKanban;
import fr.d4immobilier.visionapirest.mappers.JournalEtatKanbanMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.JournalEtatKanbanRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/journaletatkanbans")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JournalEtatKanbanResource extends GenericResource<JournalEtatKanban, JournalEtatKanbanDTO, Long> {
    
    @Inject
    private JournalEtatKanbanRepository repository;
    
    @Inject
    private JournalEtatKanbanMapper mapper;
    
    @Override
    protected GenericRepository<JournalEtatKanban, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<JournalEtatKanban, JournalEtatKanbanDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
