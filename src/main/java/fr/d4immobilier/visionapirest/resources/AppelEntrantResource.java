package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AppelEntrantDTO;
import fr.d4immobilier.visionapirest.entities.AppelEntrant;
import fr.d4immobilier.visionapirest.mappers.AppelEntrantMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AppelEntrantRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/appelentrants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AppelEntrantResource extends GenericResource<AppelEntrant, AppelEntrantDTO, Long> {
    
    @Inject
    private AppelEntrantRepository repository;
    
    @Inject
    private AppelEntrantMapper mapper;
    
    @Override
    protected GenericRepository<AppelEntrant, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<AppelEntrant, AppelEntrantDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
