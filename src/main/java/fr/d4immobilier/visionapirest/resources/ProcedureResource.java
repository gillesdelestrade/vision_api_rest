package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ProcedureDTO;
import fr.d4immobilier.visionapirest.entities.Procedure;
import fr.d4immobilier.visionapirest.mappers.ProcedureMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ProcedureRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/procedures")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProcedureResource extends GenericResource<Procedure, ProcedureDTO, Long> {
    
    @Inject
    private ProcedureRepository repository;
    
    @Inject
    private ProcedureMapper mapper;
    
    @Override
    protected GenericRepository<Procedure, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Procedure, ProcedureDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
