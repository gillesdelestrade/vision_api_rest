package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.VoteDTO;
import fr.d4immobilier.visionapirest.entities.Vote;
import fr.d4immobilier.visionapirest.mappers.VoteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.VoteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/votes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VoteResource extends GenericResource<Vote, VoteDTO, Long> {
    
    @Inject
    private VoteRepository repository;
    
    @Inject
    private VoteMapper mapper;
    
    @Override
    protected GenericRepository<Vote, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Vote, VoteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
