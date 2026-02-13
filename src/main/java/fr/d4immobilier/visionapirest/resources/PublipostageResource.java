package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PublipostageDTO;
import fr.d4immobilier.visionapirest.entities.Publipostage;
import fr.d4immobilier.visionapirest.mappers.PublipostageMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PublipostageRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/publipostages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PublipostageResource extends GenericResource<Publipostage, PublipostageDTO, Long> {
    
    @Inject
    private PublipostageRepository repository;
    
    @Inject
    private PublipostageMapper mapper;
    
    @Override
    protected GenericRepository<Publipostage, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Publipostage, PublipostageDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
