package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PVAGDTO;
import fr.d4immobilier.visionapirest.entities.PVAG;
import fr.d4immobilier.visionapirest.mappers.PVAGMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PVAGRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/pvags")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PVAGResource extends GenericResource<PVAG, PVAGDTO, Long> {
    
    @Inject
    private PVAGRepository repository;
    
    @Inject
    private PVAGMapper mapper;
    
    @Override
    protected GenericRepository<PVAG, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PVAG, PVAGDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
