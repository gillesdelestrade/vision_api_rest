package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierTrameRARDiffusionDTO;
import fr.d4immobilier.visionapirest.entities.FichierTrameRARDiffusion;
import fr.d4immobilier.visionapirest.mappers.FichierTrameRARDiffusionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierTrameRARDiffusionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichiertramerardiffusions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierTrameRARDiffusionResource extends GenericResource<FichierTrameRARDiffusion, FichierTrameRARDiffusionDTO, Long> {
    
    @Inject
    private FichierTrameRARDiffusionRepository repository;
    
    @Inject
    private FichierTrameRARDiffusionMapper mapper;
    
    @Override
    protected GenericRepository<FichierTrameRARDiffusion, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierTrameRARDiffusion, FichierTrameRARDiffusionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
