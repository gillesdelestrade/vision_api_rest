package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierDTO;
import fr.d4immobilier.visionapirest.entities.Fichier;
import fr.d4immobilier.visionapirest.mappers.FichierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichiers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierResource extends GenericResource<Fichier, FichierDTO, Long> {
    
    @Inject
    private FichierRepository repository;
    
    @Inject
    private FichierMapper mapper;
    
    @Override
    protected GenericRepository<Fichier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Fichier, FichierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
