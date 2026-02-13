package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DestinataireCourrierDTO;
import fr.d4immobilier.visionapirest.entities.DestinataireCourrier;
import fr.d4immobilier.visionapirest.mappers.DestinataireCourrierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DestinataireCourrierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/destinatairecourriers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DestinataireCourrierResource extends GenericResource<DestinataireCourrier, DestinataireCourrierDTO, Long> {
    
    @Inject
    private DestinataireCourrierRepository repository;
    
    @Inject
    private DestinataireCourrierMapper mapper;
    
    @Override
    protected GenericRepository<DestinataireCourrier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DestinataireCourrier, DestinataireCourrierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
