package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PanierCommandeMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.PanierCommandeMoyenAcces;
import fr.d4immobilier.visionapirest.mappers.PanierCommandeMoyenAccesMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PanierCommandeMoyenAccesRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/paniercommandemoyenacces")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PanierCommandeMoyenAccesResource extends GenericResource<PanierCommandeMoyenAcces, PanierCommandeMoyenAccesDTO, Long> {
    
    @Inject
    private PanierCommandeMoyenAccesRepository repository;
    
    @Inject
    private PanierCommandeMoyenAccesMapper mapper;
    
    @Override
    protected GenericRepository<PanierCommandeMoyenAcces, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PanierCommandeMoyenAcces, PanierCommandeMoyenAccesDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
