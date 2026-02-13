package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.RappelDTO;
import fr.d4immobilier.visionapirest.entities.Rappel;
import fr.d4immobilier.visionapirest.mappers.RappelMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.RappelRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/rappels")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RappelResource extends GenericResource<Rappel, RappelDTO, Long> {
    
    @Inject
    private RappelRepository repository;
    
    @Inject
    private RappelMapper mapper;
    
    @Override
    protected GenericRepository<Rappel, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Rappel, RappelDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
