package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MandataireSocieteDTO;
import fr.d4immobilier.visionapirest.entities.MandataireSociete;
import fr.d4immobilier.visionapirest.mappers.MandataireSocieteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MandataireSocieteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/mandatairesocietes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MandataireSocieteResource extends GenericResource<MandataireSociete, MandataireSocieteDTO, Long> {
    
    @Inject
    private MandataireSocieteRepository repository;
    
    @Inject
    private MandataireSocieteMapper mapper;
    
    @Override
    protected GenericRepository<MandataireSociete, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MandataireSociete, MandataireSocieteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
