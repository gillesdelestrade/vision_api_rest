package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.FichierDevisFournisseur;
import fr.d4immobilier.visionapirest.mappers.FichierDevisFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierDevisFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierdevisfournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierDevisFournisseurResource extends GenericResource<FichierDevisFournisseur, FichierDevisFournisseurDTO, Long> {
    
    @Inject
    private FichierDevisFournisseurRepository repository;
    
    @Inject
    private FichierDevisFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<FichierDevisFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierDevisFournisseur, FichierDevisFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
