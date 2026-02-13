package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TagDTO;
import fr.d4immobilier.visionapirest.entities.Tag;
import fr.d4immobilier.visionapirest.mappers.TagMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TagRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/tags")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TagResource extends GenericResource<Tag, TagDTO, Long> {
    
    @Inject
    private TagRepository repository;
    
    @Inject
    private TagMapper mapper;
    
    @Override
    protected GenericRepository<Tag, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Tag, TagDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
