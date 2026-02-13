package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ActionDemandeDTO;
import fr.d4immobilier.visionapirest.entities.ActionDemande;
import fr.d4immobilier.visionapirest.mappers.ActionDemandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ActionDemandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/actiondemandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActionDemandeResource extends GenericResource<ActionDemande, ActionDemandeDTO, Long> {
    
    @Inject
    private ActionDemandeRepository repository;
    
    @Inject
    private ActionDemandeMapper mapper;
    
    @Override
    protected GenericRepository<ActionDemande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ActionDemande, ActionDemandeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
