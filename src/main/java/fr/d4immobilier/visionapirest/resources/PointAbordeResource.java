package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PointAbordeDTO;
import fr.d4immobilier.visionapirest.entities.PointAborde;
import fr.d4immobilier.visionapirest.mappers.PointAbordeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PointAbordeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/pointabordes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PointAbordeResource extends GenericResource<PointAborde, PointAbordeDTO, Long> {
    
    @Inject
    private PointAbordeRepository repository;
    
    @Inject
    private PointAbordeMapper mapper;
    
    @Override
    protected GenericRepository<PointAborde, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PointAborde, PointAbordeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
