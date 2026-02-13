package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PersonneDTO;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.mappers.PersonneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PersonneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/personnes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonneResource extends GenericResource<Personne, PersonneDTO, Long> {
    
    @Inject
    private PersonneRepository repository;
    
    @Inject
    private PersonneMapper mapper;
    
    @Override
    protected GenericRepository<Personne, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Personne, PersonneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
