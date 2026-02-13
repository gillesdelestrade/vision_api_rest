package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PrestationContratDTO;
import fr.d4immobilier.visionapirest.entities.PrestationContrat;
import fr.d4immobilier.visionapirest.mappers.PrestationContratMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PrestationContratRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/prestationcontrats")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PrestationContratResource extends GenericResource<PrestationContrat, PrestationContratDTO, Long> {
    
    @Inject
    private PrestationContratRepository repository;
    
    @Inject
    private PrestationContratMapper mapper;
    
    @Override
    protected GenericRepository<PrestationContrat, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PrestationContrat, PrestationContratDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
