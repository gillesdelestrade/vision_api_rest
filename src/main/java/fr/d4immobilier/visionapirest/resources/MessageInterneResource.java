package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MessageInterneDTO;
import fr.d4immobilier.visionapirest.entities.MessageInterne;
import fr.d4immobilier.visionapirest.mappers.MessageInterneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MessageInterneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/messageinternes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageInterneResource extends GenericResource<MessageInterne, MessageInterneDTO, Long> {
    
    @Inject
    private MessageInterneRepository repository;
    
    @Inject
    private MessageInterneMapper mapper;
    
    @Override
    protected GenericRepository<MessageInterne, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MessageInterne, MessageInterneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
