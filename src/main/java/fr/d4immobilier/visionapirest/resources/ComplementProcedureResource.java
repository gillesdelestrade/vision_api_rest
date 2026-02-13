package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ComplementProcedureDTO;
import fr.d4immobilier.visionapirest.entities.ComplementProcedure;
import fr.d4immobilier.visionapirest.mappers.ComplementProcedureMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ComplementProcedureRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/complementprocedures")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ComplementProcedureResource extends GenericResource<ComplementProcedure, ComplementProcedureDTO, Long> {
    
    @Inject
    private ComplementProcedureRepository repository;
    
    @Inject
    private ComplementProcedureMapper mapper;
    
    @Override
    protected GenericRepository<ComplementProcedure, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ComplementProcedure, ComplementProcedureDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
