package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CourrierDemandeDTO;
import fr.d4immobilier.visionapirest.entities.CourrierDemande;
import fr.d4immobilier.visionapirest.mappers.CourrierDemandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CourrierDemandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/courrierdemandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourrierDemandeResource extends GenericResource<CourrierDemande, CourrierDemandeDTO, Long> {
    
    @Inject
    private CourrierDemandeRepository repository;
    
    @Inject
    private CourrierDemandeMapper mapper;
    
    @Override
    protected GenericRepository<CourrierDemande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CourrierDemande, CourrierDemandeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
