package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FinancementTravauxDTO;
import fr.d4immobilier.visionapirest.entities.FinancementTravaux;
import fr.d4immobilier.visionapirest.mappers.FinancementTravauxMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FinancementTravauxRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/financementtravaux")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FinancementTravauxResource extends GenericResource<FinancementTravaux, FinancementTravauxDTO, Long> {
    
    @Inject
    private FinancementTravauxRepository repository;
    
    @Inject
    private FinancementTravauxMapper mapper;
    
    @Override
    protected GenericRepository<FinancementTravaux, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FinancementTravaux, FinancementTravauxDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
