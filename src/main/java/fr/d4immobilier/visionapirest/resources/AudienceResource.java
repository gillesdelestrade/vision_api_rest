package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AudienceDTO;
import fr.d4immobilier.visionapirest.entities.Audience;
import fr.d4immobilier.visionapirest.mappers.AudienceMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AudienceRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/audiences")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AudienceResource extends GenericResource<Audience, AudienceDTO, Long> {
    
    @Inject
    private AudienceRepository repository;
    
    @Inject
    private AudienceMapper mapper;
    
    @Override
    protected GenericRepository<Audience, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Audience, AudienceDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
