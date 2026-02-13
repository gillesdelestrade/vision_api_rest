package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CandidatureCSDTO;
import fr.d4immobilier.visionapirest.entities.CandidatureCS;
import fr.d4immobilier.visionapirest.mappers.CandidatureCSMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CandidatureCSRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/candidaturecs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CandidatureCSResource extends GenericResource<CandidatureCS, CandidatureCSDTO, Long> {
    
    @Inject
    private CandidatureCSRepository repository;
    
    @Inject
    private CandidatureCSMapper mapper;
    
    @Override
    protected GenericRepository<CandidatureCS, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CandidatureCS, CandidatureCSDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
