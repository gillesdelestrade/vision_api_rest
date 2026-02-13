package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CompteVisionDTO;
import fr.d4immobilier.visionapirest.entities.CompteVision;
import fr.d4immobilier.visionapirest.mappers.CompteVisionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CompteVisionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/comptevisions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CompteVisionResource extends GenericResource<CompteVision, CompteVisionDTO, Long> {
    
    @Inject
    private CompteVisionRepository repository;
    
    @Inject
    private CompteVisionMapper mapper;
    
    @Override
    protected GenericRepository<CompteVision, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CompteVision, CompteVisionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
