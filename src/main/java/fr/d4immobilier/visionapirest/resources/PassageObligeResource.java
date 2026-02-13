package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PassageObligeDTO;
import fr.d4immobilier.visionapirest.entities.PassageOblige;
import fr.d4immobilier.visionapirest.mappers.PassageObligeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PassageObligeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/passageobliges")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PassageObligeResource extends GenericResource<PassageOblige, PassageObligeDTO, Long> {
    
    @Inject
    private PassageObligeRepository repository;
    
    @Inject
    private PassageObligeMapper mapper;
    
    @Override
    protected GenericRepository<PassageOblige, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PassageOblige, PassageObligeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
