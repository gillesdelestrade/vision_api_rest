package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierBonDeLivraisonDTO;
import fr.d4immobilier.visionapirest.entities.FichierBonDeLivraison;
import fr.d4immobilier.visionapirest.mappers.FichierBonDeLivraisonMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierBonDeLivraisonRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierbondelivraisons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierBonDeLivraisonResource extends GenericResource<FichierBonDeLivraison, FichierBonDeLivraisonDTO, Long> {
    
    @Inject
    private FichierBonDeLivraisonRepository repository;
    
    @Inject
    private FichierBonDeLivraisonMapper mapper;
    
    @Override
    protected GenericRepository<FichierBonDeLivraison, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierBonDeLivraison, FichierBonDeLivraisonDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
