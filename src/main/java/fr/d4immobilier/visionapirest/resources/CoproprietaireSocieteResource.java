package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CoproprietaireSocieteDTO;
import fr.d4immobilier.visionapirest.entities.CoproprietaireSociete;
import fr.d4immobilier.visionapirest.mappers.CoproprietaireSocieteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CoproprietaireSocieteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/coproprietairesocietes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CoproprietaireSocieteResource extends GenericResource<CoproprietaireSociete, CoproprietaireSocieteDTO, Long> {
    
    @Inject
    private CoproprietaireSocieteRepository repository;
    
    @Inject
    private CoproprietaireSocieteMapper mapper;
    
    @Override
    protected GenericRepository<CoproprietaireSociete, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CoproprietaireSociete, CoproprietaireSocieteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
