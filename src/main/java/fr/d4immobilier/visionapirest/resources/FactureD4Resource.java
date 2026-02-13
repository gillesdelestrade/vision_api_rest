package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FactureD4DTO;
import fr.d4immobilier.visionapirest.entities.FactureD4;
import fr.d4immobilier.visionapirest.mappers.FactureD4Mapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FactureD4Repository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/factured4s")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FactureD4Resource extends GenericResource<FactureD4, FactureD4DTO, Long> {
    
    @Inject
    private FactureD4Repository repository;
    
    @Inject
    private FactureD4Mapper mapper;
    
    @Override
    protected GenericRepository<FactureD4, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FactureD4, FactureD4DTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
