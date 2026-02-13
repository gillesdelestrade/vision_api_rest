package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierDemandeDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.FichierDemandeDevisFournisseur;
import fr.d4immobilier.visionapirest.mappers.FichierDemandeDevisFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierDemandeDevisFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierdemandedevisfournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierDemandeDevisFournisseurResource extends GenericResource<FichierDemandeDevisFournisseur, FichierDemandeDevisFournisseurDTO, Long> {
    
    @Inject
    private FichierDemandeDevisFournisseurRepository repository;
    
    @Inject
    private FichierDemandeDevisFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<FichierDemandeDevisFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierDemandeDevisFournisseur, FichierDemandeDevisFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
