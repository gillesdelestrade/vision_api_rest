package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.UtilisateurDTO;
import fr.d4immobilier.visionapirest.entities.Utilisateur;
import fr.d4immobilier.visionapirest.mappers.UtilisateurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.UtilisateurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/utilisateurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UtilisateurResource extends GenericResource<Utilisateur, UtilisateurDTO, Long> {
    
    @Inject
    private UtilisateurRepository repository;
    
    @Inject
    private UtilisateurMapper mapper;
    
    @Override
    protected GenericRepository<Utilisateur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Utilisateur, UtilisateurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
