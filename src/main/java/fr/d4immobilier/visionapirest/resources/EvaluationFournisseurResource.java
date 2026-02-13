package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EvaluationFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.EvaluationFournisseur;
import fr.d4immobilier.visionapirest.mappers.EvaluationFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EvaluationFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/evaluationfournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EvaluationFournisseurResource extends GenericResource<EvaluationFournisseur, EvaluationFournisseurDTO, Long> {
    
    @Inject
    private EvaluationFournisseurRepository repository;
    
    @Inject
    private EvaluationFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<EvaluationFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EvaluationFournisseur, EvaluationFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
