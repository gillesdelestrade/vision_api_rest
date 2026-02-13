package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BatimentDTO;
import fr.d4immobilier.visionapirest.entities.Batiment;
import fr.d4immobilier.visionapirest.mappers.BatimentMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BatimentRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/batiments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BatimentResource extends GenericResource<Batiment, BatimentDTO, Long> {
    
    @Inject
    private BatimentRepository repository;
    
    @Inject
    private BatimentMapper mapper;
    
    @Override
    protected GenericRepository<Batiment, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Batiment, BatimentDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
