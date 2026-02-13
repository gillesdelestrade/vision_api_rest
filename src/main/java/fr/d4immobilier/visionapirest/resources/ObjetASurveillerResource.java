package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ObjetASurveillerDTO;
import fr.d4immobilier.visionapirest.entities.ObjetASurveiller;
import fr.d4immobilier.visionapirest.mappers.ObjetASurveillerMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ObjetASurveillerRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/objetasurveillers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ObjetASurveillerResource extends GenericResource<ObjetASurveiller, ObjetASurveillerDTO, Long> {
    
    @Inject
    private ObjetASurveillerRepository repository;
    
    @Inject
    private ObjetASurveillerMapper mapper;
    
    @Override
    protected GenericRepository<ObjetASurveiller, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ObjetASurveiller, ObjetASurveillerDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
