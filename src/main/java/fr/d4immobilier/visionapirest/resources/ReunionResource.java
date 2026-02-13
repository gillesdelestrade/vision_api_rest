package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ReunionDTO;
import fr.d4immobilier.visionapirest.entities.Reunion;
import fr.d4immobilier.visionapirest.mappers.ReunionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ReunionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/reunions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReunionResource extends GenericResource<Reunion, ReunionDTO, Long> {
    
    @Inject
    private ReunionRepository repository;
    
    @Inject
    private ReunionMapper mapper;
    
    @Override
    protected GenericRepository<Reunion, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Reunion, ReunionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
