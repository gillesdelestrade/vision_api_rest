package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CommentaireDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.CommentaireDevisFournisseur;
import fr.d4immobilier.visionapirest.mappers.CommentaireDevisFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CommentaireDevisFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/commentairedevisfournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentaireDevisFournisseurResource extends GenericResource<CommentaireDevisFournisseur, CommentaireDevisFournisseurDTO, Long> {
    
    @Inject
    private CommentaireDevisFournisseurRepository repository;
    
    @Inject
    private CommentaireDevisFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<CommentaireDevisFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CommentaireDevisFournisseur, CommentaireDevisFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
