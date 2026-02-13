package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.NoeudThreadCourrierDTO;
import fr.d4immobilier.visionapirest.entities.NoeudThreadCourrier;
import fr.d4immobilier.visionapirest.mappers.NoeudThreadCourrierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.NoeudThreadCourrierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/noeudthreadcourriers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NoeudThreadCourrierResource extends GenericResource<NoeudThreadCourrier, NoeudThreadCourrierDTO, Long> {
    
    @Inject
    private NoeudThreadCourrierRepository repository;
    
    @Inject
    private NoeudThreadCourrierMapper mapper;
    
    @Override
    protected GenericRepository<NoeudThreadCourrier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<NoeudThreadCourrier, NoeudThreadCourrierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
