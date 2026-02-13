package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtape;
import fr.d4immobilier.visionapirest.mappers.ProchaineEtapeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ProchaineEtapeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/prochaineetapes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProchaineEtapeResource extends GenericResource<ProchaineEtape, ProchaineEtapeDTO, Long> {
    
    @Inject
    private ProchaineEtapeRepository repository;
    
    @Inject
    private ProchaineEtapeMapper mapper;
    
    @Override
    protected GenericRepository<ProchaineEtape, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ProchaineEtape, ProchaineEtapeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
