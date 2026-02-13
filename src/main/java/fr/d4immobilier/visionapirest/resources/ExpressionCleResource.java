package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ExpressionCleDTO;
import fr.d4immobilier.visionapirest.entities.ExpressionCle;
import fr.d4immobilier.visionapirest.mappers.ExpressionCleMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ExpressionCleRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/expressioncles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExpressionCleResource extends GenericResource<ExpressionCle, ExpressionCleDTO, Long> {
    
    @Inject
    private ExpressionCleRepository repository;
    
    @Inject
    private ExpressionCleMapper mapper;
    
    @Override
    protected GenericRepository<ExpressionCle, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ExpressionCle, ExpressionCleDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
