package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.SuppressionFraisDeRelanceDTO;
import fr.d4immobilier.visionapirest.entities.SuppressionFraisDeRelance;
import fr.d4immobilier.visionapirest.mappers.SuppressionFraisDeRelanceMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.SuppressionFraisDeRelanceRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/suppressionfraisderelances")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SuppressionFraisDeRelanceResource extends GenericResource<SuppressionFraisDeRelance, SuppressionFraisDeRelanceDTO, Long> {
    
    @Inject
    private SuppressionFraisDeRelanceRepository repository;
    
    @Inject
    private SuppressionFraisDeRelanceMapper mapper;
    
    @Override
    protected GenericRepository<SuppressionFraisDeRelance, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<SuppressionFraisDeRelance, SuppressionFraisDeRelanceDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
