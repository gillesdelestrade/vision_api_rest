package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeTypeDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeType;
import fr.d4immobilier.visionapirest.mappers.ProchaineEtapeTypeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ProchaineEtapeTypeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/prochaineetapetypes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProchaineEtapeTypeResource extends GenericResource<ProchaineEtapeType, ProchaineEtapeTypeDTO, Long> {
    
    @Inject
    private ProchaineEtapeTypeRepository repository;
    
    @Inject
    private ProchaineEtapeTypeMapper mapper;
    
    @Override
    protected GenericRepository<ProchaineEtapeType, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ProchaineEtapeType, ProchaineEtapeTypeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
