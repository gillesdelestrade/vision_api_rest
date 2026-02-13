package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AutorisationDematerialisationDTO;
import fr.d4immobilier.visionapirest.entities.AutorisationDematerialisation;
import fr.d4immobilier.visionapirest.mappers.AutorisationDematerialisationMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AutorisationDematerialisationRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/autorisationdematerialisations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AutorisationDematerialisationResource extends GenericResource<AutorisationDematerialisation, AutorisationDematerialisationDTO, Long> {
    
    @Inject
    private AutorisationDematerialisationRepository repository;
    
    @Inject
    private AutorisationDematerialisationMapper mapper;
    
    @Override
    protected GenericRepository<AutorisationDematerialisation, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<AutorisationDematerialisation, AutorisationDematerialisationDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
