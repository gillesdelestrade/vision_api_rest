package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.OuvrantDTO;
import fr.d4immobilier.visionapirest.entities.Ouvrant;
import fr.d4immobilier.visionapirest.mappers.OuvrantMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.OuvrantRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/ouvrants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OuvrantResource extends GenericResource<Ouvrant, OuvrantDTO, Long> {
    
    @Inject
    private OuvrantRepository repository;
    
    @Inject
    private OuvrantMapper mapper;
    
    @Override
    protected GenericRepository<Ouvrant, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Ouvrant, OuvrantDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
