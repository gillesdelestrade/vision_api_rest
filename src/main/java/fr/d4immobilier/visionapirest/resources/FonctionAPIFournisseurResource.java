package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FonctionAPIFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.FonctionAPIFournisseur;
import fr.d4immobilier.visionapirest.mappers.FonctionAPIFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FonctionAPIFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fonctionapifournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FonctionAPIFournisseurResource extends GenericResource<FonctionAPIFournisseur, FonctionAPIFournisseurDTO, Long> {
    
    @Inject
    private FonctionAPIFournisseurRepository repository;
    
    @Inject
    private FonctionAPIFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<FonctionAPIFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FonctionAPIFournisseur, FonctionAPIFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
