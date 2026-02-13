package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EvenementAutorisationDematerialisationDTO;
import fr.d4immobilier.visionapirest.entities.EvenementAutorisationDematerialisation;
import fr.d4immobilier.visionapirest.mappers.EvenementAutorisationDematerialisationMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EvenementAutorisationDematerialisationRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/evenementautorisationdematerialisations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EvenementAutorisationDematerialisationResource extends GenericResource<EvenementAutorisationDematerialisation, EvenementAutorisationDematerialisationDTO, Long> {
    
    @Inject
    private EvenementAutorisationDematerialisationRepository repository;
    
    @Inject
    private EvenementAutorisationDematerialisationMapper mapper;
    
    @Override
    protected GenericRepository<EvenementAutorisationDematerialisation, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EvenementAutorisationDematerialisation, EvenementAutorisationDematerialisationDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
