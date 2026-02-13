package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MotNonPertinentDTO;
import fr.d4immobilier.visionapirest.entities.MotNonPertinent;
import fr.d4immobilier.visionapirest.mappers.MotNonPertinentMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MotNonPertinentRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/motnonpertinents")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MotNonPertinentResource extends GenericResource<MotNonPertinent, MotNonPertinentDTO, Long> {
    
    @Inject
    private MotNonPertinentRepository repository;
    
    @Inject
    private MotNonPertinentMapper mapper;
    
    @Override
    protected GenericRepository<MotNonPertinent, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MotNonPertinent, MotNonPertinentDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
