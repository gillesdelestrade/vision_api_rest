package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EtapePlanifAGModeleDTO;
import fr.d4immobilier.visionapirest.entities.EtapePlanifAGModele;
import fr.d4immobilier.visionapirest.mappers.EtapePlanifAGModeleMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EtapePlanifAGModeleRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/etapeplanifagmodeles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EtapePlanifAGModeleResource extends GenericResource<EtapePlanifAGModele, EtapePlanifAGModeleDTO, Long> {
    
    @Inject
    private EtapePlanifAGModeleRepository repository;
    
    @Inject
    private EtapePlanifAGModeleMapper mapper;
    
    @Override
    protected GenericRepository<EtapePlanifAGModele, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EtapePlanifAGModele, EtapePlanifAGModeleDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
