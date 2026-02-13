package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierInterventionDemandeDTO;
import fr.d4immobilier.visionapirest.entities.FichierInterventionDemande;
import fr.d4immobilier.visionapirest.mappers.FichierInterventionDemandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierInterventionDemandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierinterventiondemandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierInterventionDemandeResource extends GenericResource<FichierInterventionDemande, FichierInterventionDemandeDTO, Long> {
    
    @Inject
    private FichierInterventionDemandeRepository repository;
    
    @Inject
    private FichierInterventionDemandeMapper mapper;
    
    @Override
    protected GenericRepository<FichierInterventionDemande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierInterventionDemande, FichierInterventionDemandeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
