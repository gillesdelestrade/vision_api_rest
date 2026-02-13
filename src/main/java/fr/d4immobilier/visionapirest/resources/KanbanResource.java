package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.KanbanDTO;
import fr.d4immobilier.visionapirest.entities.Kanban;
import fr.d4immobilier.visionapirest.mappers.KanbanMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.KanbanRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/kanbans")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class KanbanResource extends GenericResource<Kanban, KanbanDTO, Long> {
    
    @Inject
    private KanbanRepository repository;
    
    @Inject
    private KanbanMapper mapper;
    
    @Override
    protected GenericRepository<Kanban, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Kanban, KanbanDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
