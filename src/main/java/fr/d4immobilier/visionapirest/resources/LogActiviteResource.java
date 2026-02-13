package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.LogActiviteDTO;
import fr.d4immobilier.visionapirest.entities.LogActivite;
import fr.d4immobilier.visionapirest.mappers.LogActiviteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.LogActiviteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/logactivites")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LogActiviteResource extends GenericResource<LogActivite, LogActiviteDTO, Long> {
    
    @Inject
    private LogActiviteRepository repository;
    
    @Inject
    private LogActiviteMapper mapper;
    
    @Override
    protected GenericRepository<LogActivite, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<LogActivite, LogActiviteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
