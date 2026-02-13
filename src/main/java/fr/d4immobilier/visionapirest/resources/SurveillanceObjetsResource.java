package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.SurveillanceObjetsDTO;
import fr.d4immobilier.visionapirest.entities.SurveillanceObjets;
import fr.d4immobilier.visionapirest.mappers.SurveillanceObjetsMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.SurveillanceObjetsRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/surveillanceobjets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SurveillanceObjetsResource extends GenericResource<SurveillanceObjets, SurveillanceObjetsDTO, Long> {
    
    @Inject
    private SurveillanceObjetsRepository repository;
    
    @Inject
    private SurveillanceObjetsMapper mapper;
    
    @Override
    protected GenericRepository<SurveillanceObjets, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<SurveillanceObjets, SurveillanceObjetsDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
