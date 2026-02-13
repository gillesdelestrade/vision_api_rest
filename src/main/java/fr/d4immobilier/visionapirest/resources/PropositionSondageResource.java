package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PropositionSondageDTO;
import fr.d4immobilier.visionapirest.entities.PropositionSondage;
import fr.d4immobilier.visionapirest.mappers.PropositionSondageMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PropositionSondageRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/propositionsondages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PropositionSondageResource extends GenericResource<PropositionSondage, PropositionSondageDTO, Long> {
    
    @Inject
    private PropositionSondageRepository repository;
    
    @Inject
    private PropositionSondageMapper mapper;
    
    @Override
    protected GenericRepository<PropositionSondage, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PropositionSondage, PropositionSondageDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
