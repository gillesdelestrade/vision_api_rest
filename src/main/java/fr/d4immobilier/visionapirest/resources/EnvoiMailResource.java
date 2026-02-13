package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EnvoiMailDTO;
import fr.d4immobilier.visionapirest.entities.EnvoiMail;
import fr.d4immobilier.visionapirest.mappers.EnvoiMailMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EnvoiMailRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/envoimails")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EnvoiMailResource extends GenericResource<EnvoiMail, EnvoiMailDTO, Long> {
    
    @Inject
    private EnvoiMailRepository repository;
    
    @Inject
    private EnvoiMailMapper mapper;
    
    @Override
    protected GenericRepository<EnvoiMail, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EnvoiMail, EnvoiMailDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
