package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TagEvenementDTO;
import fr.d4immobilier.visionapirest.entities.TagEvenement;
import fr.d4immobilier.visionapirest.mappers.TagEvenementMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TagEvenementRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/tagevenements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TagEvenementResource extends GenericResource<TagEvenement, TagEvenementDTO, Long> {
    
    @Inject
    private TagEvenementRepository repository;
    
    @Inject
    private TagEvenementMapper mapper;
    
    @Override
    protected GenericRepository<TagEvenement, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<TagEvenement, TagEvenementDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
