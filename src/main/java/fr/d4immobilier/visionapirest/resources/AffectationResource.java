package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AffectationDTO;
import fr.d4immobilier.visionapirest.entities.Affectation;
import fr.d4immobilier.visionapirest.mappers.AffectationMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AffectationRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/affectations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AffectationResource extends GenericResource<Affectation, AffectationDTO, Long> {
    
    @Inject
    private AffectationRepository repository;
    
    @Inject
    private AffectationMapper mapper;
    
    @Override
    protected GenericRepository<Affectation, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Affectation, AffectationDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
