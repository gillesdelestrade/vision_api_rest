package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeActionDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeAction;
import fr.d4immobilier.visionapirest.mappers.ProchaineEtapeActionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ProchaineEtapeActionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/prochaineetapeactions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProchaineEtapeActionResource extends GenericResource<ProchaineEtapeAction, ProchaineEtapeActionDTO, Long> {
    
    @Inject
    private ProchaineEtapeActionRepository repository;
    
    @Inject
    private ProchaineEtapeActionMapper mapper;
    
    @Override
    protected GenericRepository<ProchaineEtapeAction, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ProchaineEtapeAction, ProchaineEtapeActionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
