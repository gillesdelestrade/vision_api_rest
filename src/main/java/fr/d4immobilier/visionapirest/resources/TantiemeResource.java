package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TantiemeDTO;
import fr.d4immobilier.visionapirest.entities.Tantieme;
import fr.d4immobilier.visionapirest.mappers.TantiemeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TantiemeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/tantiemes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TantiemeResource extends GenericResource<Tantieme, TantiemeDTO, Long> {
    
    @Inject
    private TantiemeRepository repository;
    
    @Inject
    private TantiemeMapper mapper;
    
    @Override
    protected GenericRepository<Tantieme, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Tantieme, TantiemeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
