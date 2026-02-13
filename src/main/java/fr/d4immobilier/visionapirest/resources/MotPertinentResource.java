package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MotPertinentDTO;
import fr.d4immobilier.visionapirest.entities.MotPertinent;
import fr.d4immobilier.visionapirest.mappers.MotPertinentMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MotPertinentRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/motpertinents")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MotPertinentResource extends GenericResource<MotPertinent, MotPertinentDTO, Long> {
    
    @Inject
    private MotPertinentRepository repository;
    
    @Inject
    private MotPertinentMapper mapper;
    
    @Override
    protected GenericRepository<MotPertinent, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MotPertinent, MotPertinentDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
