package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TVADTO;
import fr.d4immobilier.visionapirest.entities.TVA;
import fr.d4immobilier.visionapirest.mappers.TVAMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TVARepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/tvas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TVAResource extends GenericResource<TVA, TVADTO, Long> {
    
    @Inject
    private TVARepository repository;
    
    @Inject
    private TVAMapper mapper;
    
    @Override
    protected GenericRepository<TVA, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<TVA, TVADTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
