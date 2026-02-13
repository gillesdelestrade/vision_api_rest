package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PresenceDTO;
import fr.d4immobilier.visionapirest.entities.Presence;
import fr.d4immobilier.visionapirest.mappers.PresenceMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PresenceRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/presences")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PresenceResource extends GenericResource<Presence, PresenceDTO, Long> {
    
    @Inject
    private PresenceRepository repository;
    
    @Inject
    private PresenceMapper mapper;
    
    @Override
    protected GenericRepository<Presence, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Presence, PresenceDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
