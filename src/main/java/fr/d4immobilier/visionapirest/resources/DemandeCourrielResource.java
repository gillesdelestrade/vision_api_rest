package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DemandeCourrielDTO;
import fr.d4immobilier.visionapirest.entities.DemandeCourriel;
import fr.d4immobilier.visionapirest.mappers.DemandeCourrielMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DemandeCourrielRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/demandecourriels")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemandeCourrielResource extends GenericResource<DemandeCourriel, DemandeCourrielDTO, Long> {
    
    @Inject
    private DemandeCourrielRepository repository;
    
    @Inject
    private DemandeCourrielMapper mapper;
    
    @Override
    protected GenericRepository<DemandeCourriel, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DemandeCourriel, DemandeCourrielDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
