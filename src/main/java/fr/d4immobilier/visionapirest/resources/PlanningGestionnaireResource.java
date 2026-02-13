package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PlanningGestionnaireDTO;
import fr.d4immobilier.visionapirest.entities.PlanningGestionnaire;
import fr.d4immobilier.visionapirest.mappers.PlanningGestionnaireMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PlanningGestionnaireRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/planninggestionnaires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlanningGestionnaireResource extends GenericResource<PlanningGestionnaire, PlanningGestionnaireDTO, Long> {
    
    @Inject
    private PlanningGestionnaireRepository repository;
    
    @Inject
    private PlanningGestionnaireMapper mapper;
    
    @Override
    protected GenericRepository<PlanningGestionnaire, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PlanningGestionnaire, PlanningGestionnaireDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
