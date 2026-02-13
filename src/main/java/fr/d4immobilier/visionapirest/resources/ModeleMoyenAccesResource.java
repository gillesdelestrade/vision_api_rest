package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ModeleMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.ModeleMoyenAcces;
import fr.d4immobilier.visionapirest.mappers.ModeleMoyenAccesMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ModeleMoyenAccesRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/modelemoyenacces")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ModeleMoyenAccesResource extends GenericResource<ModeleMoyenAcces, ModeleMoyenAccesDTO, Long> {
    
    @Inject
    private ModeleMoyenAccesRepository repository;
    
    @Inject
    private ModeleMoyenAccesMapper mapper;
    
    @Override
    protected GenericRepository<ModeleMoyenAcces, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ModeleMoyenAcces, ModeleMoyenAccesDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
