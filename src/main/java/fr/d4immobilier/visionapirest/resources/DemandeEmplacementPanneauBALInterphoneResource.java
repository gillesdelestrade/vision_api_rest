package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DemandeEmplacementPanneauBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.DemandeEmplacementPanneauBALInterphone;
import fr.d4immobilier.visionapirest.mappers.DemandeEmplacementPanneauBALInterphoneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DemandeEmplacementPanneauBALInterphoneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/demandeemplacementpanneaubalinterphones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemandeEmplacementPanneauBALInterphoneResource extends GenericResource<DemandeEmplacementPanneauBALInterphone, DemandeEmplacementPanneauBALInterphoneDTO, Long> {
    
    @Inject
    private DemandeEmplacementPanneauBALInterphoneRepository repository;
    
    @Inject
    private DemandeEmplacementPanneauBALInterphoneMapper mapper;
    
    @Override
    protected GenericRepository<DemandeEmplacementPanneauBALInterphone, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DemandeEmplacementPanneauBALInterphone, DemandeEmplacementPanneauBALInterphoneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
