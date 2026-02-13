package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.LexiqueAPID4DTO;
import fr.d4immobilier.visionapirest.entities.LexiqueAPID4;
import fr.d4immobilier.visionapirest.mappers.LexiqueAPID4Mapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.LexiqueAPID4Repository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/lexiqueapid4s")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LexiqueAPID4Resource extends GenericResource<LexiqueAPID4, LexiqueAPID4DTO, Long> {
    
    @Inject
    private LexiqueAPID4Repository repository;
    
    @Inject
    private LexiqueAPID4Mapper mapper;
    
    @Override
    protected GenericRepository<LexiqueAPID4, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<LexiqueAPID4, LexiqueAPID4DTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
