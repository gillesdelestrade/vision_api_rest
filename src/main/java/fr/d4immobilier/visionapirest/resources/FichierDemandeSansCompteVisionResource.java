package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierDemandeSansCompteVisionDTO;
import fr.d4immobilier.visionapirest.entities.FichierDemandeSansCompteVision;
import fr.d4immobilier.visionapirest.mappers.FichierDemandeSansCompteVisionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierDemandeSansCompteVisionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierdemandesanscomptevisions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierDemandeSansCompteVisionResource extends GenericResource<FichierDemandeSansCompteVision, FichierDemandeSansCompteVisionDTO, Long> {
    
    @Inject
    private FichierDemandeSansCompteVisionRepository repository;
    
    @Inject
    private FichierDemandeSansCompteVisionMapper mapper;
    
    @Override
    protected GenericRepository<FichierDemandeSansCompteVision, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierDemandeSansCompteVision, FichierDemandeSansCompteVisionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
