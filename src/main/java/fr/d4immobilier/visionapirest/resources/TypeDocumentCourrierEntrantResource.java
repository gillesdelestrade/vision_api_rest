package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TypeDocumentCourrierEntrantDTO;
import fr.d4immobilier.visionapirest.entities.TypeDocumentCourrierEntrant;
import fr.d4immobilier.visionapirest.mappers.TypeDocumentCourrierEntrantMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TypeDocumentCourrierEntrantRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/typedocumentcourrierentrants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TypeDocumentCourrierEntrantResource extends GenericResource<TypeDocumentCourrierEntrant, TypeDocumentCourrierEntrantDTO, Long> {
    
    @Inject
    private TypeDocumentCourrierEntrantRepository repository;
    
    @Inject
    private TypeDocumentCourrierEntrantMapper mapper;
    
    @Override
    protected GenericRepository<TypeDocumentCourrierEntrant, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<TypeDocumentCourrierEntrant, TypeDocumentCourrierEntrantDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
