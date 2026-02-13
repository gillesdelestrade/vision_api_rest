package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierCourrierEntrantDTO;
import fr.d4immobilier.visionapirest.entities.FichierCourrierEntrant;
import fr.d4immobilier.visionapirest.mappers.FichierCourrierEntrantMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierCourrierEntrantRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichiercourrierentrants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierCourrierEntrantResource extends GenericResource<FichierCourrierEntrant, FichierCourrierEntrantDTO, Long> {
    
    @Inject
    private FichierCourrierEntrantRepository repository;
    
    @Inject
    private FichierCourrierEntrantMapper mapper;
    
    @Override
    protected GenericRepository<FichierCourrierEntrant, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierCourrierEntrant, FichierCourrierEntrantDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
