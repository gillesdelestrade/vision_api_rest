package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierDemandeDTO;
import fr.d4immobilier.visionapirest.entities.FichierDemande;
import fr.d4immobilier.visionapirest.mappers.FichierDemandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierDemandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierdemandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierDemandeResource extends GenericResource<FichierDemande, FichierDemandeDTO, Long> {
    
    @Inject
    private FichierDemandeRepository repository;
    
    @Inject
    private FichierDemandeMapper mapper;
    
    @Override
    protected GenericRepository<FichierDemande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierDemande, FichierDemandeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
