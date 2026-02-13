package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ModeleCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ModeleCourrier;
import fr.d4immobilier.visionapirest.mappers.ModeleCourrierMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ModeleCourrierRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/modelecourriers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ModeleCourrierResource extends GenericResource<ModeleCourrier, ModeleCourrierDTO, Long> {
    
    @Inject
    private ModeleCourrierRepository repository;
    
    @Inject
    private ModeleCourrierMapper mapper;
    
    @Override
    protected GenericRepository<ModeleCourrier, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ModeleCourrier, ModeleCourrierDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
