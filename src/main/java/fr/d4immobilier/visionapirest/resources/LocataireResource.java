package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.LocataireDTO;
import fr.d4immobilier.visionapirest.entities.Locataire;
import fr.d4immobilier.visionapirest.mappers.LocataireMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.LocataireRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/locataires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LocataireResource extends GenericResource<Locataire, LocataireDTO, Long> {
    
    @Inject
    private LocataireRepository repository;
    
    @Inject
    private LocataireMapper mapper;
    
    @Override
    protected GenericRepository<Locataire, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Locataire, LocataireDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
