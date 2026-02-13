package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierEmplacementDTO;
import fr.d4immobilier.visionapirest.entities.FichierEmplacement;
import fr.d4immobilier.visionapirest.mappers.FichierEmplacementMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierEmplacementRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichieremplacements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierEmplacementResource extends GenericResource<FichierEmplacement, FichierEmplacementDTO, Long> {
    
    @Inject
    private FichierEmplacementRepository repository;
    
    @Inject
    private FichierEmplacementMapper mapper;
    
    @Override
    protected GenericRepository<FichierEmplacement, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierEmplacement, FichierEmplacementDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
