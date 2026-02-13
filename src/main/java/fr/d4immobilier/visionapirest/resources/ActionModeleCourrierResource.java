package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ActionModeleCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ActionModeleCourrier;
import fr.d4immobilier.visionapirest.mappers.ActionModeleCourrierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ActionModeleCourrierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/actionmodelecourriers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActionModeleCourrierResource extends GenericResource<ActionModeleCourrier, ActionModeleCourrierDTO, Long> {
    
    @Inject
    private ActionModeleCourrierRepository repository;
    
    @Inject
    private ActionModeleCourrierMapper mapper;
    
    @Override
    protected GenericRepository<ActionModeleCourrier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ActionModeleCourrier, ActionModeleCourrierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
