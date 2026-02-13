package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.HistoriqueNavigationDTO;
import fr.d4immobilier.visionapirest.entities.HistoriqueNavigation;
import fr.d4immobilier.visionapirest.mappers.HistoriqueNavigationMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.HistoriqueNavigationRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/historiquenavigations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HistoriqueNavigationResource extends GenericResource<HistoriqueNavigation, HistoriqueNavigationDTO, Long> {
    
    @Inject
    private HistoriqueNavigationRepository repository;
    
    @Inject
    private HistoriqueNavigationMapper mapper;
    
    @Override
    protected GenericRepository<HistoriqueNavigation, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<HistoriqueNavigation, HistoriqueNavigationDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
