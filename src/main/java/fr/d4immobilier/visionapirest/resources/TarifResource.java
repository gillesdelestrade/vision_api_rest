package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TarifDTO;
import fr.d4immobilier.visionapirest.entities.Tarif;
import fr.d4immobilier.visionapirest.mappers.TarifMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TarifRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/tarifs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TarifResource extends GenericResource<Tarif, TarifDTO, Long> {
    
    @Inject
    private TarifRepository repository;
    
    @Inject
    private TarifMapper mapper;
    
    @Override
    protected GenericRepository<Tarif, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Tarif, TarifDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
