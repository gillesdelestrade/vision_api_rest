package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ConciergeDTO;
import fr.d4immobilier.visionapirest.entities.Concierge;
import fr.d4immobilier.visionapirest.mappers.ConciergeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ConciergeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/concierges")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConciergeResource extends GenericResource<Concierge, ConciergeDTO, Long> {
    
    @Inject
    private ConciergeRepository repository;
    
    @Inject
    private ConciergeMapper mapper;
    
    @Override
    protected GenericRepository<Concierge, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Concierge, ConciergeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
