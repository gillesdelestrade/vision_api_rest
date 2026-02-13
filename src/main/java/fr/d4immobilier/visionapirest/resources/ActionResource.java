package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ActionDTO;
import fr.d4immobilier.visionapirest.entities.Action;
import fr.d4immobilier.visionapirest.mappers.ActionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ActionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/actions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActionResource extends GenericResource<Action, ActionDTO, Long> {
    
    @Inject
    private ActionRepository repository;
    
    @Inject
    private ActionMapper mapper;
    
    @Override
    protected GenericRepository<Action, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Action, ActionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
