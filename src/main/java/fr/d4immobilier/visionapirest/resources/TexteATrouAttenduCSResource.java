package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TexteATrouAttenduCSDTO;
import fr.d4immobilier.visionapirest.entities.TexteATrouAttenduCS;
import fr.d4immobilier.visionapirest.mappers.TexteATrouAttenduCSMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TexteATrouAttenduCSRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/texteatrouattenducs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TexteATrouAttenduCSResource extends GenericResource<TexteATrouAttenduCS, TexteATrouAttenduCSDTO, Long> {
    
    @Inject
    private TexteATrouAttenduCSRepository repository;
    
    @Inject
    private TexteATrouAttenduCSMapper mapper;
    
    @Override
    protected GenericRepository<TexteATrouAttenduCS, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<TexteATrouAttenduCS, TexteATrouAttenduCSDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
