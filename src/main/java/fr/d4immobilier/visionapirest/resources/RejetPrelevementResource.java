package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.RejetPrelevementDTO;
import fr.d4immobilier.visionapirest.entities.RejetPrelevement;
import fr.d4immobilier.visionapirest.mappers.RejetPrelevementMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.RejetPrelevementRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/rejetprelevements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RejetPrelevementResource extends GenericResource<RejetPrelevement, RejetPrelevementDTO, Long> {
    
    @Inject
    private RejetPrelevementRepository repository;
    
    @Inject
    private RejetPrelevementMapper mapper;
    
    @Override
    protected GenericRepository<RejetPrelevement, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<RejetPrelevement, RejetPrelevementDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
