package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DossierDTO;
import fr.d4immobilier.visionapirest.entities.Dossier;
import fr.d4immobilier.visionapirest.mappers.DossierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DossierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/dossiers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DossierResource extends GenericResource<Dossier, DossierDTO, Long> {
    
    @Inject
    private DossierRepository repository;
    
    @Inject
    private DossierMapper mapper;
    
    @Override
    protected GenericRepository<Dossier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Dossier, DossierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
