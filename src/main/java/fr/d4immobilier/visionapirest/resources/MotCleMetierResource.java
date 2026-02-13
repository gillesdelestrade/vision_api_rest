package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MotCleMetierDTO;
import fr.d4immobilier.visionapirest.entities.MotCleMetier;
import fr.d4immobilier.visionapirest.mappers.MotCleMetierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MotCleMetierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/motclemetiers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MotCleMetierResource extends GenericResource<MotCleMetier, MotCleMetierDTO, Long> {
    
    @Inject
    private MotCleMetierRepository repository;
    
    @Inject
    private MotCleMetierMapper mapper;
    
    @Override
    protected GenericRepository<MotCleMetier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MotCleMetier, MotCleMetierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
