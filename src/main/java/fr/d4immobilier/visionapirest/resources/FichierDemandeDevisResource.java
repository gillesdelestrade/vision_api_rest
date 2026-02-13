package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierDemandeDevisDTO;
import fr.d4immobilier.visionapirest.entities.FichierDemandeDevis;
import fr.d4immobilier.visionapirest.mappers.FichierDemandeDevisMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierDemandeDevisRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierdemandedevis")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierDemandeDevisResource extends GenericResource<FichierDemandeDevis, FichierDemandeDevisDTO, Long> {
    
    @Inject
    private FichierDemandeDevisRepository repository;
    
    @Inject
    private FichierDemandeDevisMapper mapper;
    
    @Override
    protected GenericRepository<FichierDemandeDevis, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierDemandeDevis, FichierDemandeDevisDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
