package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ARappelerDTO;
import fr.d4immobilier.visionapirest.entities.ARappeler;
import fr.d4immobilier.visionapirest.mappers.ARappelerMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ARappelerRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/arappelers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ARappelerResource extends GenericResource<ARappeler, ARappelerDTO, Long> {
    
    @Inject
    private ARappelerRepository repository;
    
    @Inject
    private ARappelerMapper mapper;
    
    @Override
    protected GenericRepository<ARappeler, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ARappeler, ARappelerDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
