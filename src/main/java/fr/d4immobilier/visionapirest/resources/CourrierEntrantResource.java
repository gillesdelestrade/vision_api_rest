package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CourrierEntrantDTO;
import fr.d4immobilier.visionapirest.entities.CourrierEntrant;
import fr.d4immobilier.visionapirest.mappers.CourrierEntrantMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CourrierEntrantRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/courrierentrants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourrierEntrantResource extends GenericResource<CourrierEntrant, CourrierEntrantDTO, Long> {
    
    @Inject
    private CourrierEntrantRepository repository;
    
    @Inject
    private CourrierEntrantMapper mapper;
    
    @Override
    protected GenericRepository<CourrierEntrant, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CourrierEntrant, CourrierEntrantDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
