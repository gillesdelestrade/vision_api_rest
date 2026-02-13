package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.OptionTravauxDTO;
import fr.d4immobilier.visionapirest.entities.OptionTravaux;
import fr.d4immobilier.visionapirest.mappers.OptionTravauxMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.OptionTravauxRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/optiontravaux")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OptionTravauxResource extends GenericResource<OptionTravaux, OptionTravauxDTO, Long> {
    
    @Inject
    private OptionTravauxRepository repository;
    
    @Inject
    private OptionTravauxMapper mapper;
    
    @Override
    protected GenericRepository<OptionTravaux, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<OptionTravaux, OptionTravauxDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
