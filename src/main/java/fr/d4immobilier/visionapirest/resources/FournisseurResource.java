package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FournisseurDTO;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.mappers.FournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FournisseurResource extends GenericResource<Fournisseur, FournisseurDTO, Long> {
    
    @Inject
    private FournisseurRepository repository;
    
    @Inject
    private FournisseurMapper mapper;
    
    @Override
    protected GenericRepository<Fournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Fournisseur, FournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
