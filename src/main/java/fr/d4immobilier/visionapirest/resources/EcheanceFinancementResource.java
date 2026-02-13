package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EcheanceFinancementDTO;
import fr.d4immobilier.visionapirest.entities.EcheanceFinancement;
import fr.d4immobilier.visionapirest.mappers.EcheanceFinancementMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EcheanceFinancementRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/echeancefinancements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EcheanceFinancementResource extends GenericResource<EcheanceFinancement, EcheanceFinancementDTO, Long> {
    
    @Inject
    private EcheanceFinancementRepository repository;
    
    @Inject
    private EcheanceFinancementMapper mapper;
    
    @Override
    protected GenericRepository<EcheanceFinancement, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EcheanceFinancement, EcheanceFinancementDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
