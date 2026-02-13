package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.GestionnaireDTO;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
import fr.d4immobilier.visionapirest.mappers.GestionnaireMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.GestionnaireRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/gestionnaires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GestionnaireResource extends GenericResource<Gestionnaire, GestionnaireDTO, Long> {
    
    @Inject
    private GestionnaireRepository repository;
    
    @Inject
    private GestionnaireMapper mapper;
    
    @Override
    protected GenericRepository<Gestionnaire, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Gestionnaire, GestionnaireDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
