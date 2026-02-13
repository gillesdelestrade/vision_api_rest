package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DevisD4DTO;
import fr.d4immobilier.visionapirest.entities.DevisD4;
import fr.d4immobilier.visionapirest.mappers.DevisD4Mapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DevisD4Repository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/devisd4s")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DevisD4Resource extends GenericResource<DevisD4, DevisD4DTO, Long> {
    
    @Inject
    private DevisD4Repository repository;
    
    @Inject
    private DevisD4Mapper mapper;
    
    @Override
    protected GenericRepository<DevisD4, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DevisD4, DevisD4DTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
