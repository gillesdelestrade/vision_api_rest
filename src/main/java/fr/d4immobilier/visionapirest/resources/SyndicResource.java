package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.SyndicDTO;
import fr.d4immobilier.visionapirest.entities.Syndic;
import fr.d4immobilier.visionapirest.mappers.SyndicMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.SyndicRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/syndics")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SyndicResource extends GenericResource<Syndic, SyndicDTO, Long> {
    
    @Inject
    private SyndicRepository repository;
    
    @Inject
    private SyndicMapper mapper;
    
    @Override
    protected GenericRepository<Syndic, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Syndic, SyndicDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
