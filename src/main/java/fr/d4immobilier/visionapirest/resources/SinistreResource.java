package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.SinistreDTO;
import fr.d4immobilier.visionapirest.entities.Sinistre;
import fr.d4immobilier.visionapirest.mappers.SinistreMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.SinistreRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/sinistres")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SinistreResource extends GenericResource<Sinistre, SinistreDTO, Long> {
    
    @Inject
    private SinistreRepository repository;
    
    @Inject
    private SinistreMapper mapper;
    
    @Override
    protected GenericRepository<Sinistre, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Sinistre, SinistreDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
