package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ResolutionTravauxDTO;
import fr.d4immobilier.visionapirest.entities.ResolutionTravaux;
import fr.d4immobilier.visionapirest.mappers.ResolutionTravauxMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ResolutionTravauxRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/resolutiontravaux")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ResolutionTravauxResource extends GenericResource<ResolutionTravaux, ResolutionTravauxDTO, Long> {
    
    @Inject
    private ResolutionTravauxRepository repository;
    
    @Inject
    private ResolutionTravauxMapper mapper;
    
    @Override
    protected GenericRepository<ResolutionTravaux, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ResolutionTravaux, ResolutionTravauxDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
