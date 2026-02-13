package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BordereauDTO;
import fr.d4immobilier.visionapirest.entities.Bordereau;
import fr.d4immobilier.visionapirest.mappers.BordereauMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BordereauRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/bordereaux")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BordereauResource extends GenericResource<Bordereau, BordereauDTO, Long> {
    
    @Inject
    private BordereauRepository repository;
    
    @Inject
    private BordereauMapper mapper;
    
    @Override
    protected GenericRepository<Bordereau, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Bordereau, BordereauDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
