package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EvenementDemandeDTO;
import fr.d4immobilier.visionapirest.entities.EvenementDemande;
import fr.d4immobilier.visionapirest.mappers.EvenementDemandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EvenementDemandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/evenementdemandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EvenementDemandeResource extends GenericResource<EvenementDemande, EvenementDemandeDTO, Long> {
    
    @Inject
    private EvenementDemandeRepository repository;
    
    @Inject
    private EvenementDemandeMapper mapper;
    
    @Override
    protected GenericRepository<EvenementDemande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EvenementDemande, EvenementDemandeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
