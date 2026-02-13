package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CourrielDTO;
import fr.d4immobilier.visionapirest.entities.Courriel;
import fr.d4immobilier.visionapirest.mappers.CourrielMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CourrielRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/courriels")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourrielResource extends GenericResource<Courriel, CourrielDTO, Long> {
    
    @Inject
    private CourrielRepository repository;
    
    @Inject
    private CourrielMapper mapper;
    
    @Override
    protected GenericRepository<Courriel, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Courriel, CourrielDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
