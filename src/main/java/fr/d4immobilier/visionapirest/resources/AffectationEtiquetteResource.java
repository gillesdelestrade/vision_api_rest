package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AffectationEtiquetteDTO;
import fr.d4immobilier.visionapirest.entities.AffectationEtiquette;
import fr.d4immobilier.visionapirest.mappers.AffectationEtiquetteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AffectationEtiquetteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/affectationetiquettes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AffectationEtiquetteResource extends GenericResource<AffectationEtiquette, AffectationEtiquetteDTO, Long> {
    
    @Inject
    private AffectationEtiquetteRepository repository;
    
    @Inject
    private AffectationEtiquetteMapper mapper;
    
    @Override
    protected GenericRepository<AffectationEtiquette, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<AffectationEtiquette, AffectationEtiquetteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
