package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BoiteMailDTO;
import fr.d4immobilier.visionapirest.entities.BoiteMail;
import fr.d4immobilier.visionapirest.mappers.BoiteMailMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BoiteMailRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/boitemails")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BoiteMailResource extends GenericResource<BoiteMail, BoiteMailDTO, Long> {
    
    @Inject
    private BoiteMailRepository repository;
    
    @Inject
    private BoiteMailMapper mapper;
    
    @Override
    protected GenericRepository<BoiteMail, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<BoiteMail, BoiteMailDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
