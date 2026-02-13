package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ODJReunionDTO;
import fr.d4immobilier.visionapirest.entities.ODJReunion;
import fr.d4immobilier.visionapirest.mappers.ODJReunionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ODJReunionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/odjreunions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ODJReunionResource extends GenericResource<ODJReunion, ODJReunionDTO, Long> {
    
    @Inject
    private ODJReunionRepository repository;
    
    @Inject
    private ODJReunionMapper mapper;
    
    @Override
    protected GenericRepository<ODJReunion, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ODJReunion, ODJReunionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
