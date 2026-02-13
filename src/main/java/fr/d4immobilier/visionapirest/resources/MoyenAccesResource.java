package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.MoyenAcces;
import fr.d4immobilier.visionapirest.mappers.MoyenAccesMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MoyenAccesRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/moyenacces")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MoyenAccesResource extends GenericResource<MoyenAcces, MoyenAccesDTO, Long> {
    
    @Inject
    private MoyenAccesRepository repository;
    
    @Inject
    private MoyenAccesMapper mapper;
    
    @Override
    protected GenericRepository<MoyenAcces, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MoyenAcces, MoyenAccesDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
