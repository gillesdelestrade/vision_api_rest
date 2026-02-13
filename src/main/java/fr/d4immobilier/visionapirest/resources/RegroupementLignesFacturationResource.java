package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.RegroupementLignesFacturationDTO;
import fr.d4immobilier.visionapirest.entities.RegroupementLignesFacturation;
import fr.d4immobilier.visionapirest.mappers.RegroupementLignesFacturationMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.RegroupementLignesFacturationRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/regroupementlignesfacturations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegroupementLignesFacturationResource extends GenericResource<RegroupementLignesFacturation, RegroupementLignesFacturationDTO, Long> {
    
    @Inject
    private RegroupementLignesFacturationRepository repository;
    
    @Inject
    private RegroupementLignesFacturationMapper mapper;
    
    @Override
    protected GenericRepository<RegroupementLignesFacturation, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<RegroupementLignesFacturation, RegroupementLignesFacturationDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
