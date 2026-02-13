package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.SocieteDTO;
import fr.d4immobilier.visionapirest.entities.Societe;
import fr.d4immobilier.visionapirest.mappers.SocieteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.SocieteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/societes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SocieteResource extends GenericResource<Societe, SocieteDTO, Long> {
    
    @Inject
    private SocieteRepository repository;
    
    @Inject
    private SocieteMapper mapper;
    
    @Override
    protected GenericRepository<Societe, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Societe, SocieteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
