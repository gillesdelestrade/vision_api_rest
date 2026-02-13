package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.LigneFacturationDTO;
import fr.d4immobilier.visionapirest.entities.LigneFacturation;
import fr.d4immobilier.visionapirest.mappers.LigneFacturationMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.LigneFacturationRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/lignefacturations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LigneFacturationResource extends GenericResource<LigneFacturation, LigneFacturationDTO, Long> {
    
    @Inject
    private LigneFacturationRepository repository;
    
    @Inject
    private LigneFacturationMapper mapper;
    
    @Override
    protected GenericRepository<LigneFacturation, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<LigneFacturation, LigneFacturationDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
