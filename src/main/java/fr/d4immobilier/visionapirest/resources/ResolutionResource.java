package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ResolutionDTO;
import fr.d4immobilier.visionapirest.entities.Resolution;
import fr.d4immobilier.visionapirest.mappers.ResolutionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ResolutionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/resolutions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ResolutionResource extends GenericResource<Resolution, ResolutionDTO, Long> {
    
    @Inject
    private ResolutionRepository repository;
    
    @Inject
    private ResolutionMapper mapper;
    
    @Override
    protected GenericRepository<Resolution, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Resolution, ResolutionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
