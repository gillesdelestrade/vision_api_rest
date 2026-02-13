package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AgenceDTO;
import fr.d4immobilier.visionapirest.entities.Agence;
import fr.d4immobilier.visionapirest.mappers.AgenceMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AgenceRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/agences")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AgenceResource extends GenericResource<Agence, AgenceDTO, Long> {
    
    @Inject
    private AgenceRepository repository;
    
    @Inject
    private AgenceMapper mapper;
    
    @Override
    protected GenericRepository<Agence, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Agence, AgenceDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
