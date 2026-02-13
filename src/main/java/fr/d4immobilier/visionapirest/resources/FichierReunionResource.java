package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierReunionDTO;
import fr.d4immobilier.visionapirest.entities.FichierReunion;
import fr.d4immobilier.visionapirest.mappers.FichierReunionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierReunionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierreunions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierReunionResource extends GenericResource<FichierReunion, FichierReunionDTO, Long> {
    
    @Inject
    private FichierReunionRepository repository;
    
    @Inject
    private FichierReunionMapper mapper;
    
    @Override
    protected GenericRepository<FichierReunion, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierReunion, FichierReunionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
