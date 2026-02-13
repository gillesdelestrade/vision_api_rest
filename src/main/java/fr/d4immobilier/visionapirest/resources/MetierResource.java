package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MetierDTO;
import fr.d4immobilier.visionapirest.entities.Metier;
import fr.d4immobilier.visionapirest.mappers.MetierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MetierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/metiers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MetierResource extends GenericResource<Metier, MetierDTO, Long> {
    
    @Inject
    private MetierRepository repository;
    
    @Inject
    private MetierMapper mapper;
    
    @Override
    protected GenericRepository<Metier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Metier, MetierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
