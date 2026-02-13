package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ThreadCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ThreadCourrier;
import fr.d4immobilier.visionapirest.mappers.ThreadCourrierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ThreadCourrierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/threadcourriers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ThreadCourrierResource extends GenericResource<ThreadCourrier, ThreadCourrierDTO, Long> {
    
    @Inject
    private ThreadCourrierRepository repository;
    
    @Inject
    private ThreadCourrierMapper mapper;
    
    @Override
    protected GenericRepository<ThreadCourrier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ThreadCourrier, ThreadCourrierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
