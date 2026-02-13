package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AutorisationValidationFacturesDTO;
import fr.d4immobilier.visionapirest.entities.AutorisationValidationFactures;
import fr.d4immobilier.visionapirest.mappers.AutorisationValidationFacturesMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AutorisationValidationFacturesRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/autorisationvalidationfactures")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AutorisationValidationFacturesResource extends GenericResource<AutorisationValidationFactures, AutorisationValidationFacturesDTO, Long> {
    
    @Inject
    private AutorisationValidationFacturesRepository repository;
    
    @Inject
    private AutorisationValidationFacturesMapper mapper;
    
    @Override
    protected GenericRepository<AutorisationValidationFactures, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<AutorisationValidationFactures, AutorisationValidationFacturesDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
