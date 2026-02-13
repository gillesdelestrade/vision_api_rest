package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.APIFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.APIFournisseur;
import fr.d4immobilier.visionapirest.mappers.APIFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.APIFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/apifournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class APIFournisseurResource extends GenericResource<APIFournisseur, APIFournisseurDTO, Long> {
    
    @Inject
    private APIFournisseurRepository repository;
    
    @Inject
    private APIFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<APIFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<APIFournisseur, APIFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
