package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EmplacementPanneauBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.EmplacementPanneauBALInterphone;
import fr.d4immobilier.visionapirest.mappers.EmplacementPanneauBALInterphoneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EmplacementPanneauBALInterphoneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/emplacementpanneaubalinterphones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmplacementPanneauBALInterphoneResource extends GenericResource<EmplacementPanneauBALInterphone, EmplacementPanneauBALInterphoneDTO, Long> {
    
    @Inject
    private EmplacementPanneauBALInterphoneRepository repository;
    
    @Inject
    private EmplacementPanneauBALInterphoneMapper mapper;
    
    @Override
    protected GenericRepository<EmplacementPanneauBALInterphone, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EmplacementPanneauBALInterphone, EmplacementPanneauBALInterphoneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
