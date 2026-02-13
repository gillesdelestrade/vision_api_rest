package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ARappelerCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ARappelerCourrier;
import fr.d4immobilier.visionapirest.mappers.ARappelerCourrierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ARappelerCourrierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/arappelercourriers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ARappelerCourrierResource extends GenericResource<ARappelerCourrier, ARappelerCourrierDTO, Long> {
    
    @Inject
    private ARappelerCourrierRepository repository;
    
    @Inject
    private ARappelerCourrierMapper mapper;
    
    @Override
    protected GenericRepository<ARappelerCourrier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ARappelerCourrier, ARappelerCourrierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
