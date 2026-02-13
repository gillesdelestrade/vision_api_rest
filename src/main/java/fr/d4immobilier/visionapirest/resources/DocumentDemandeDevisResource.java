package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DocumentDemandeDevisDTO;
import fr.d4immobilier.visionapirest.entities.DocumentDemandeDevis;
import fr.d4immobilier.visionapirest.mappers.DocumentDemandeDevisMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DocumentDemandeDevisRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/documentdemandedevis")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DocumentDemandeDevisResource extends GenericResource<DocumentDemandeDevis, DocumentDemandeDevisDTO, Long> {
    
    @Inject
    private DocumentDemandeDevisRepository repository;
    
    @Inject
    private DocumentDemandeDevisMapper mapper;
    
    @Override
    protected GenericRepository<DocumentDemandeDevis, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DocumentDemandeDevis, DocumentDemandeDevisDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
