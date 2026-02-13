package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.LivraisonDTO;
import fr.d4immobilier.visionapirest.entities.Livraison;
import fr.d4immobilier.visionapirest.mappers.LivraisonMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.LivraisonRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/livraisons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LivraisonResource extends GenericResource<Livraison, LivraisonDTO, Long> {
    
    @Inject
    private LivraisonRepository repository;
    
    @Inject
    private LivraisonMapper mapper;
    
    @Override
    protected GenericRepository<Livraison, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Livraison, LivraisonDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
