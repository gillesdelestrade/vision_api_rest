package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EmplacementStockDTO;
import fr.d4immobilier.visionapirest.entities.EmplacementStock;
import fr.d4immobilier.visionapirest.mappers.EmplacementStockMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EmplacementStockRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/emplacementstocks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmplacementStockResource extends GenericResource<EmplacementStock, EmplacementStockDTO, Long> {
    
    @Inject
    private EmplacementStockRepository repository;
    
    @Inject
    private EmplacementStockMapper mapper;
    
    @Override
    protected GenericRepository<EmplacementStock, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EmplacementStock, EmplacementStockDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
