package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EtapePlanifAGDTO;
import fr.d4immobilier.visionapirest.entities.EtapePlanifAG;
import fr.d4immobilier.visionapirest.mappers.EtapePlanifAGMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EtapePlanifAGRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/etapeplanifags")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EtapePlanifAGResource extends GenericResource<EtapePlanifAG, EtapePlanifAGDTO, Long> {
    
    @Inject
    private EtapePlanifAGRepository repository;
    
    @Inject
    private EtapePlanifAGMapper mapper;
    
    @Override
    protected GenericRepository<EtapePlanifAG, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EtapePlanifAG, EtapePlanifAGDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
