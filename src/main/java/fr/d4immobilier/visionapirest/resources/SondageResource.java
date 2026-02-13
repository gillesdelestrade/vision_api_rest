package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.SondageDTO;
import fr.d4immobilier.visionapirest.entities.Sondage;
import fr.d4immobilier.visionapirest.mappers.SondageMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.SondageRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/sondages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SondageResource extends GenericResource<Sondage, SondageDTO, Long> {
    
    @Inject
    private SondageRepository repository;
    
    @Inject
    private SondageMapper mapper;
    
    @Override
    protected GenericRepository<Sondage, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Sondage, SondageDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
