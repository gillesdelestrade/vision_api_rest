package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.RegroupementResolutionsDTO;
import fr.d4immobilier.visionapirest.entities.RegroupementResolutions;
import fr.d4immobilier.visionapirest.mappers.RegroupementResolutionsMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.RegroupementResolutionsRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/regroupementresolutions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegroupementResolutionsResource extends GenericResource<RegroupementResolutions, RegroupementResolutionsDTO, Long> {
    
    @Inject
    private RegroupementResolutionsRepository repository;
    
    @Inject
    private RegroupementResolutionsMapper mapper;
    
    @Override
    protected GenericRepository<RegroupementResolutions, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<RegroupementResolutions, RegroupementResolutionsDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
