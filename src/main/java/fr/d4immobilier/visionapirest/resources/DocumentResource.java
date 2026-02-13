package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DocumentDTO;
import fr.d4immobilier.visionapirest.entities.Document;
import fr.d4immobilier.visionapirest.mappers.DocumentMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DocumentRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/documents")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DocumentResource extends GenericResource<Document, DocumentDTO, Long> {
    
    @Inject
    private DocumentRepository repository;
    
    @Inject
    private DocumentMapper mapper;
    
    @Override
    protected GenericRepository<Document, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Document, DocumentDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
