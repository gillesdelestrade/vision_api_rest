package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.RibDTO;
import fr.d4immobilier.visionapirest.entities.Rib;
import fr.d4immobilier.visionapirest.mappers.RibMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.RibRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/ribs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RibResource extends GenericResource<Rib, RibDTO, Long> {
    
    @Inject
    private RibRepository repository;
    
    @Inject
    private RibMapper mapper;
    
    @Override
    protected GenericRepository<Rib, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Rib, RibDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
