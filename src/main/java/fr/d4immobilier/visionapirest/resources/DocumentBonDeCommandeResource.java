package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DocumentBonDeCommandeDTO;
import fr.d4immobilier.visionapirest.entities.DocumentBonDeCommande;
import fr.d4immobilier.visionapirest.mappers.DocumentBonDeCommandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DocumentBonDeCommandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/documentbondecommandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DocumentBonDeCommandeResource extends GenericResource<DocumentBonDeCommande, DocumentBonDeCommandeDTO, Long> {
    
    @Inject
    private DocumentBonDeCommandeRepository repository;
    
    @Inject
    private DocumentBonDeCommandeMapper mapper;
    
    @Override
    protected GenericRepository<DocumentBonDeCommande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DocumentBonDeCommande, DocumentBonDeCommandeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
