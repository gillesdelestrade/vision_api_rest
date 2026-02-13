package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.RappelTelephoniqueDTO;
import fr.d4immobilier.visionapirest.entities.RappelTelephonique;
import fr.d4immobilier.visionapirest.mappers.RappelTelephoniqueMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.RappelTelephoniqueRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/rappeltelephoniques")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RappelTelephoniqueResource extends GenericResource<RappelTelephonique, RappelTelephoniqueDTO, Long> {
    
    @Inject
    private RappelTelephoniqueRepository repository;
    
    @Inject
    private RappelTelephoniqueMapper mapper;
    
    @Override
    protected GenericRepository<RappelTelephonique, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<RappelTelephonique, RappelTelephoniqueDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
