package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ReunionV2DTO;
import fr.d4immobilier.visionapirest.entities.ReunionV2;
import fr.d4immobilier.visionapirest.mappers.ReunionV2Mapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ReunionV2Repository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/reunionv2s")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReunionV2Resource extends GenericResource<ReunionV2, ReunionV2DTO, Long> {
    
    @Inject
    private ReunionV2Repository repository;
    
    @Inject
    private ReunionV2Mapper mapper;
    
    @Override
    protected GenericRepository<ReunionV2, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ReunionV2, ReunionV2DTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
