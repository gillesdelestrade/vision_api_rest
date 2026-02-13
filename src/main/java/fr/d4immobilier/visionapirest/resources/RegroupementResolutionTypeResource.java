package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.RegroupementResolutionTypeDTO;
import fr.d4immobilier.visionapirest.entities.RegroupementResolutionType;
import fr.d4immobilier.visionapirest.mappers.RegroupementResolutionTypeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.RegroupementResolutionTypeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/regroupementresolutiontypes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegroupementResolutionTypeResource extends GenericResource<RegroupementResolutionType, RegroupementResolutionTypeDTO, Long> {
    
    @Inject
    private RegroupementResolutionTypeRepository repository;
    
    @Inject
    private RegroupementResolutionTypeMapper mapper;
    
    @Override
    protected GenericRepository<RegroupementResolutionType, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<RegroupementResolutionType, RegroupementResolutionTypeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
