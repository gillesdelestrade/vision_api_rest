package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AttenduCSDTO;
import fr.d4immobilier.visionapirest.entities.AttenduCS;
import fr.d4immobilier.visionapirest.mappers.AttenduCSMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AttenduCSRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/attenducs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AttenduCSResource extends GenericResource<AttenduCS, AttenduCSDTO, Long> {
    
    @Inject
    private AttenduCSRepository repository;
    
    @Inject
    private AttenduCSMapper mapper;
    
    @Override
    protected GenericRepository<AttenduCS, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<AttenduCS, AttenduCSDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
