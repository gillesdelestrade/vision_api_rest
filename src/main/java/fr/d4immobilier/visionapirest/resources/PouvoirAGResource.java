package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PouvoirAGDTO;
import fr.d4immobilier.visionapirest.entities.PouvoirAG;
import fr.d4immobilier.visionapirest.mappers.PouvoirAGMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PouvoirAGRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/pouvoirags")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PouvoirAGResource extends GenericResource<PouvoirAG, PouvoirAGDTO, Long> {
    
    @Inject
    private PouvoirAGRepository repository;
    
    @Inject
    private PouvoirAGMapper mapper;
    
    @Override
    protected GenericRepository<PouvoirAG, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PouvoirAG, PouvoirAGDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
