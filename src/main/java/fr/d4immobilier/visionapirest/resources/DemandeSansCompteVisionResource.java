package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DemandeSansCompteVisionDTO;
import fr.d4immobilier.visionapirest.entities.DemandeSansCompteVision;
import fr.d4immobilier.visionapirest.mappers.DemandeSansCompteVisionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DemandeSansCompteVisionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/demandesanscomptevisions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemandeSansCompteVisionResource extends GenericResource<DemandeSansCompteVision, DemandeSansCompteVisionDTO, Long> {
    
    @Inject
    private DemandeSansCompteVisionRepository repository;
    
    @Inject
    private DemandeSansCompteVisionMapper mapper;
    
    @Override
    protected GenericRepository<DemandeSansCompteVision, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DemandeSansCompteVision, DemandeSansCompteVisionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
