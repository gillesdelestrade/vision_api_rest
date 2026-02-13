package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DocumentBonDeLivraisonDTO;
import fr.d4immobilier.visionapirest.entities.DocumentBonDeLivraison;
import fr.d4immobilier.visionapirest.mappers.DocumentBonDeLivraisonMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DocumentBonDeLivraisonRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/documentbondelivraisons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DocumentBonDeLivraisonResource extends GenericResource<DocumentBonDeLivraison, DocumentBonDeLivraisonDTO, Long> {
    
    @Inject
    private DocumentBonDeLivraisonRepository repository;
    
    @Inject
    private DocumentBonDeLivraisonMapper mapper;
    
    @Override
    protected GenericRepository<DocumentBonDeLivraison, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DocumentBonDeLivraison, DocumentBonDeLivraisonDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
