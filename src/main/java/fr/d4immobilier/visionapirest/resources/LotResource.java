package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.LotDTO;
import fr.d4immobilier.visionapirest.entities.Lot;
import fr.d4immobilier.visionapirest.mappers.LotMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.LotRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/lots")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LotResource extends GenericResource<Lot, LotDTO, Long> {
    
    @Inject
    private LotRepository repository;
    
    @Inject
    private LotMapper mapper;
    
    @Override
    protected GenericRepository<Lot, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Lot, LotDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
