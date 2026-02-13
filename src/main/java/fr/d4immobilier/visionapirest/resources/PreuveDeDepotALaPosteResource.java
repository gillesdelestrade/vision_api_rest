package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PreuveDeDepotALaPosteDTO;
import fr.d4immobilier.visionapirest.entities.PreuveDeDepotALaPoste;
import fr.d4immobilier.visionapirest.mappers.PreuveDeDepotALaPosteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PreuveDeDepotALaPosteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/preuvededepotalapostes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PreuveDeDepotALaPosteResource extends GenericResource<PreuveDeDepotALaPoste, PreuveDeDepotALaPosteDTO, Long> {
    
    @Inject
    private PreuveDeDepotALaPosteRepository repository;
    
    @Inject
    private PreuveDeDepotALaPosteMapper mapper;
    
    @Override
    protected GenericRepository<PreuveDeDepotALaPoste, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PreuveDeDepotALaPoste, PreuveDeDepotALaPosteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
