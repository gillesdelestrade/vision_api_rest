package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ResolutionTypeDTO;
import fr.d4immobilier.visionapirest.entities.ResolutionType;
import fr.d4immobilier.visionapirest.mappers.ResolutionTypeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ResolutionTypeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/resolutiontypes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ResolutionTypeResource extends GenericResource<ResolutionType, ResolutionTypeDTO, Long> {
    
    @Inject
    private ResolutionTypeRepository repository;
    
    @Inject
    private ResolutionTypeMapper mapper;
    
    @Override
    protected GenericRepository<ResolutionType, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ResolutionType, ResolutionTypeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
