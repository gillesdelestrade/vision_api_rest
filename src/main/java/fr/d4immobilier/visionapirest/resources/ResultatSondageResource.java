package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ResultatSondageDTO;
import fr.d4immobilier.visionapirest.entities.ResultatSondage;
import fr.d4immobilier.visionapirest.mappers.ResultatSondageMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ResultatSondageRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/resultatsondages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ResultatSondageResource extends GenericResource<ResultatSondage, ResultatSondageDTO, Long> {
    
    @Inject
    private ResultatSondageRepository repository;
    
    @Inject
    private ResultatSondageMapper mapper;
    
    @Override
    protected GenericRepository<ResultatSondage, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ResultatSondage, ResultatSondageDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
