package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CourrierFactureDTO;
import fr.d4immobilier.visionapirest.entities.CourrierFacture;
import fr.d4immobilier.visionapirest.mappers.CourrierFactureMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CourrierFactureRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/courrierfactures")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourrierFactureResource extends GenericResource<CourrierFacture, CourrierFactureDTO, Long> {
    
    @Inject
    private CourrierFactureRepository repository;
    
    @Inject
    private CourrierFactureMapper mapper;
    
    @Override
    protected GenericRepository<CourrierFacture, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CourrierFacture, CourrierFactureDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
