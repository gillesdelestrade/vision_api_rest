package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AdresseDTO;
import fr.d4immobilier.visionapirest.entities.Adresse;
import fr.d4immobilier.visionapirest.mappers.AdresseMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AdresseRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/adresses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AdresseResource extends GenericResource<Adresse, AdresseDTO, Long> {
    
    @Inject
    private AdresseRepository repository;
    
    @Inject
    private AdresseMapper mapper;
    
    @Override
    protected GenericRepository<Adresse, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Adresse, AdresseDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
