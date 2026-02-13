package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CommentaireFactureFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.CommentaireFactureFournisseur;
import fr.d4immobilier.visionapirest.mappers.CommentaireFactureFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CommentaireFactureFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/commentairefacturefournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentaireFactureFournisseurResource extends GenericResource<CommentaireFactureFournisseur, CommentaireFactureFournisseurDTO, Long> {
    
    @Inject
    private CommentaireFactureFournisseurRepository repository;
    
    @Inject
    private CommentaireFactureFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<CommentaireFactureFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CommentaireFactureFournisseur, CommentaireFactureFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
