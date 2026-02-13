package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierTrameRARConvocDTO;
import fr.d4immobilier.visionapirest.entities.FichierTrameRARConvoc;
import fr.d4immobilier.visionapirest.mappers.FichierTrameRARConvocMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierTrameRARConvocRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichiertramerarconvocs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierTrameRARConvocResource extends GenericResource<FichierTrameRARConvoc, FichierTrameRARConvocDTO, Long> {
    
    @Inject
    private FichierTrameRARConvocRepository repository;
    
    @Inject
    private FichierTrameRARConvocMapper mapper;
    
    @Override
    protected GenericRepository<FichierTrameRARConvoc, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierTrameRARConvoc, FichierTrameRARConvocDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
