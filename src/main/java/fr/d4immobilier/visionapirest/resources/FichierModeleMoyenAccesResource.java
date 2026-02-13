package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierModeleMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.FichierModeleMoyenAcces;
import fr.d4immobilier.visionapirest.mappers.FichierModeleMoyenAccesMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierModeleMoyenAccesRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichiermodelemoyenacces")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierModeleMoyenAccesResource extends GenericResource<FichierModeleMoyenAcces, FichierModeleMoyenAccesDTO, Long> {
    
    @Inject
    private FichierModeleMoyenAccesRepository repository;
    
    @Inject
    private FichierModeleMoyenAccesMapper mapper;
    
    @Override
    protected GenericRepository<FichierModeleMoyenAcces, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierModeleMoyenAcces, FichierModeleMoyenAccesDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
