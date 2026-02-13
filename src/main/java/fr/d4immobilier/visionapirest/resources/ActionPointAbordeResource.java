package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ActionPointAbordeDTO;
import fr.d4immobilier.visionapirest.entities.ActionPointAborde;
import fr.d4immobilier.visionapirest.mappers.ActionPointAbordeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ActionPointAbordeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/actionpointabordes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActionPointAbordeResource extends GenericResource<ActionPointAborde, ActionPointAbordeDTO, Long> {
    
    @Inject
    private ActionPointAbordeRepository repository;
    
    @Inject
    private ActionPointAbordeMapper mapper;
    
    @Override
    protected GenericRepository<ActionPointAborde, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ActionPointAborde, ActionPointAbordeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
