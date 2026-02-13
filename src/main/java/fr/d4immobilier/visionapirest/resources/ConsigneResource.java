package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ConsigneDTO;
import fr.d4immobilier.visionapirest.entities.Consigne;
import fr.d4immobilier.visionapirest.mappers.ConsigneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ConsigneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/consignes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConsigneResource extends GenericResource<Consigne, ConsigneDTO, Long> {
    
    @Inject
    private ConsigneRepository repository;
    
    @Inject
    private ConsigneMapper mapper;
    
    @Override
    protected GenericRepository<Consigne, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Consigne, ConsigneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
