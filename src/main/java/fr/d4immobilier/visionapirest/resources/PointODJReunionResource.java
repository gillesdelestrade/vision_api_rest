package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PointODJReunionDTO;
import fr.d4immobilier.visionapirest.entities.PointODJReunion;
import fr.d4immobilier.visionapirest.mappers.PointODJReunionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PointODJReunionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/pointodjreunions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PointODJReunionResource extends GenericResource<PointODJReunion, PointODJReunionDTO, Long> {
    
    @Inject
    private PointODJReunionRepository repository;
    
    @Inject
    private PointODJReunionMapper mapper;
    
    @Override
    protected GenericRepository<PointODJReunion, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PointODJReunion, PointODJReunionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
