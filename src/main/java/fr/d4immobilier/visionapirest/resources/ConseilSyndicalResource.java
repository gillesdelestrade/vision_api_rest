package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ConseilSyndicalDTO;
import fr.d4immobilier.visionapirest.entities.ConseilSyndical;
import fr.d4immobilier.visionapirest.mappers.ConseilSyndicalMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ConseilSyndicalRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import fr.d4immobilier.visionapirest.services.ConseilSyndicalService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/conseilsyndicaux")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConseilSyndicalResource extends GenericResource<ConseilSyndical, ConseilSyndicalDTO, Long> {
    
    @Inject
    private ConseilSyndicalRepository repository;
    
    @Inject
    private ConseilSyndicalMapper mapper;
    
    @Override
    protected GenericRepository<ConseilSyndical, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ConseilSyndical, ConseilSyndicalDTO> getMapper() {
        return mapper;
    }
    
    
}
