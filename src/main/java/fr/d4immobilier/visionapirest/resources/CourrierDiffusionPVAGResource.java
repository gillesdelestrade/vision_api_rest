package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CourrierDiffusionPVAGDTO;
import fr.d4immobilier.visionapirest.entities.CourrierDiffusionPVAG;
import fr.d4immobilier.visionapirest.mappers.CourrierDiffusionPVAGMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CourrierDiffusionPVAGRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/courrierdiffusionpvags")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourrierDiffusionPVAGResource extends GenericResource<CourrierDiffusionPVAG, CourrierDiffusionPVAGDTO, Long> {
    
    @Inject
    private CourrierDiffusionPVAGRepository repository;
    
    @Inject
    private CourrierDiffusionPVAGMapper mapper;
    
    @Override
    protected GenericRepository<CourrierDiffusionPVAG, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CourrierDiffusionPVAG, CourrierDiffusionPVAGDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
