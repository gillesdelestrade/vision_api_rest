package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierContratDTO;
import fr.d4immobilier.visionapirest.entities.FichierContrat;
import fr.d4immobilier.visionapirest.mappers.FichierContratMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierContratRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichiercontrats")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierContratResource extends GenericResource<FichierContrat, FichierContratDTO, Long> {
    
    @Inject
    private FichierContratRepository repository;
    
    @Inject
    private FichierContratMapper mapper;
    
    @Override
    protected GenericRepository<FichierContrat, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierContrat, FichierContratDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
