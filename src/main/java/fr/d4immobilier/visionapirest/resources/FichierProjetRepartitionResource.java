package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierProjetRepartitionDTO;
import fr.d4immobilier.visionapirest.entities.FichierProjetRepartition;
import fr.d4immobilier.visionapirest.mappers.FichierProjetRepartitionMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierProjetRepartitionRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierprojetrepartitions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierProjetRepartitionResource extends GenericResource<FichierProjetRepartition, FichierProjetRepartitionDTO, Long> {
    
    @Inject
    private FichierProjetRepartitionRepository repository;
    
    @Inject
    private FichierProjetRepartitionMapper mapper;
    
    @Override
    protected GenericRepository<FichierProjetRepartition, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierProjetRepartition, FichierProjetRepartitionDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
