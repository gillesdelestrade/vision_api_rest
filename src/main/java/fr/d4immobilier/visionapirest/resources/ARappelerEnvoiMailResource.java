package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ARappelerEnvoiMailDTO;
import fr.d4immobilier.visionapirest.entities.ARappelerEnvoiMail;
import fr.d4immobilier.visionapirest.mappers.ARappelerEnvoiMailMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ARappelerEnvoiMailRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/arappelerenvoimails")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ARappelerEnvoiMailResource extends GenericResource<ARappelerEnvoiMail, ARappelerEnvoiMailDTO, Long> {
    
    @Inject
    private ARappelerEnvoiMailRepository repository;
    
    @Inject
    private ARappelerEnvoiMailMapper mapper;
    
    @Override
    protected GenericRepository<ARappelerEnvoiMail, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ARappelerEnvoiMail, ARappelerEnvoiMailDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
