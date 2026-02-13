package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ActionPVAGDTO;
import fr.d4immobilier.visionapirest.entities.ActionPVAG;
import fr.d4immobilier.visionapirest.mappers.ActionPVAGMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ActionPVAGRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/actionpvags")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActionPVAGResource extends GenericResource<ActionPVAG, ActionPVAGDTO, Long> {
    
    @Inject
    private ActionPVAGRepository repository;
    
    @Inject
    private ActionPVAGMapper mapper;
    
    @Override
    protected GenericRepository<ActionPVAG, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ActionPVAG, ActionPVAGDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
