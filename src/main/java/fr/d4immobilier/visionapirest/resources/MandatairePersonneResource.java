package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MandatairePersonneDTO;
import fr.d4immobilier.visionapirest.entities.MandatairePersonne;
import fr.d4immobilier.visionapirest.mappers.MandatairePersonneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MandatairePersonneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/mandatairepersonnes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MandatairePersonneResource extends GenericResource<MandatairePersonne, MandatairePersonneDTO, Long> {
    
    @Inject
    private MandatairePersonneRepository repository;
    
    @Inject
    private MandatairePersonneMapper mapper;
    
    @Override
    protected GenericRepository<MandatairePersonne, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MandatairePersonne, MandatairePersonneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
