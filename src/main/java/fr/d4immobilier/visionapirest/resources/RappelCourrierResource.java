package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.RappelCourrierDTO;
import fr.d4immobilier.visionapirest.entities.RappelCourrier;
import fr.d4immobilier.visionapirest.mappers.RappelCourrierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.RappelCourrierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/rappelcourriers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RappelCourrierResource extends GenericResource<RappelCourrier, RappelCourrierDTO, Long> {
    
    @Inject
    private RappelCourrierRepository repository;
    
    @Inject
    private RappelCourrierMapper mapper;
    
    @Override
    protected GenericRepository<RappelCourrier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<RappelCourrier, RappelCourrierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
