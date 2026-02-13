package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PanierDemandesInterventionDTO;
import fr.d4immobilier.visionapirest.entities.PanierDemandesIntervention;
import fr.d4immobilier.visionapirest.mappers.PanierDemandesInterventionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PanierDemandesInterventionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/panierdemandesinterventions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PanierDemandesInterventionResource extends GenericResource<PanierDemandesIntervention, PanierDemandesInterventionDTO, Long> {
    
    @Inject
    private PanierDemandesInterventionRepository repository;
    
    @Inject
    private PanierDemandesInterventionMapper mapper;
    
    @Override
    protected GenericRepository<PanierDemandesIntervention, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PanierDemandesIntervention, PanierDemandesInterventionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
