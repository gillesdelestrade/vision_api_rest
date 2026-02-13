package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AssuranceDTO;
import fr.d4immobilier.visionapirest.entities.Assurance;
import fr.d4immobilier.visionapirest.mappers.AssuranceMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AssuranceRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/assurances")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AssuranceResource extends GenericResource<Assurance, AssuranceDTO, Long> {
    
    @Inject
    private AssuranceRepository repository;
    
    @Inject
    private AssuranceMapper mapper;
    
    @Override
    protected GenericRepository<Assurance, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Assurance, AssuranceDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
