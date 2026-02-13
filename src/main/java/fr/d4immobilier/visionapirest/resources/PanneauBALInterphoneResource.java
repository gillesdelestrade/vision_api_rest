package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PanneauBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.PanneauBALInterphone;
import fr.d4immobilier.visionapirest.mappers.PanneauBALInterphoneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PanneauBALInterphoneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/panneaubalinterphones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PanneauBALInterphoneResource extends GenericResource<PanneauBALInterphone, PanneauBALInterphoneDTO, Long> {
    
    @Inject
    private PanneauBALInterphoneRepository repository;
    
    @Inject
    private PanneauBALInterphoneMapper mapper;
    
    @Override
    protected GenericRepository<PanneauBALInterphone, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PanneauBALInterphone, PanneauBALInterphoneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
