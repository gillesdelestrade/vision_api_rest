package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierFactureDTO;
import fr.d4immobilier.visionapirest.entities.FichierFacture;
import fr.d4immobilier.visionapirest.mappers.FichierFactureMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierFactureRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierfactures")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierFactureResource extends GenericResource<FichierFacture, FichierFactureDTO, Long> {
    
    @Inject
    private FichierFactureRepository repository;
    
    @Inject
    private FichierFactureMapper mapper;
    
    @Override
    protected GenericRepository<FichierFacture, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierFacture, FichierFactureDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
