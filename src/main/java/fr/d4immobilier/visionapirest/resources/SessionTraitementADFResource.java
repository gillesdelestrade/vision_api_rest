package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.SessionTraitementADFDTO;
import fr.d4immobilier.visionapirest.entities.SessionTraitementADF;
import fr.d4immobilier.visionapirest.mappers.SessionTraitementADFMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.SessionTraitementADFRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/sessiontraitementadfs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SessionTraitementADFResource extends GenericResource<SessionTraitementADF, SessionTraitementADFDTO, Long> {
    
    @Inject
    private SessionTraitementADFRepository repository;
    
    @Inject
    private SessionTraitementADFMapper mapper;
    
    @Override
    protected GenericRepository<SessionTraitementADF, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<SessionTraitementADF, SessionTraitementADFDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
