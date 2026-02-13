package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MandatSyndicDTO;
import fr.d4immobilier.visionapirest.entities.MandatSyndic;
import fr.d4immobilier.visionapirest.mappers.MandatSyndicMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MandatSyndicRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/mandatsyndics")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MandatSyndicResource extends GenericResource<MandatSyndic, MandatSyndicDTO, Long> {
    
    @Inject
    private MandatSyndicRepository repository;
    
    @Inject
    private MandatSyndicMapper mapper;
    
    @Override
    protected GenericRepository<MandatSyndic, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MandatSyndic, MandatSyndicDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
