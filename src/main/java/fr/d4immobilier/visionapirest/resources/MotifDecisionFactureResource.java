package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MotifDecisionFactureDTO;
import fr.d4immobilier.visionapirest.entities.MotifDecisionFacture;
import fr.d4immobilier.visionapirest.mappers.MotifDecisionFactureMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MotifDecisionFactureRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/motifdecisionfactures")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MotifDecisionFactureResource extends GenericResource<MotifDecisionFacture, MotifDecisionFactureDTO, Long> {
    
    @Inject
    private MotifDecisionFactureRepository repository;
    
    @Inject
    private MotifDecisionFactureMapper mapper;
    
    @Override
    protected GenericRepository<MotifDecisionFacture, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MotifDecisionFacture, MotifDecisionFactureDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
