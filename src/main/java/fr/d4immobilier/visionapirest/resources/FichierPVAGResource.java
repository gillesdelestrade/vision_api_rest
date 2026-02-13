package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierPVAGDTO;
import fr.d4immobilier.visionapirest.entities.FichierPVAG;
import fr.d4immobilier.visionapirest.mappers.FichierPVAGMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierPVAGRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierpvags")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierPVAGResource extends GenericResource<FichierPVAG, FichierPVAGDTO, Long> {
    
    @Inject
    private FichierPVAGRepository repository;
    
    @Inject
    private FichierPVAGMapper mapper;
    
    @Override
    protected GenericRepository<FichierPVAG, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierPVAG, FichierPVAGDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
