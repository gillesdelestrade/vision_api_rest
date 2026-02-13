package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PrixCatalogueDTO;
import fr.d4immobilier.visionapirest.entities.PrixCatalogue;
import fr.d4immobilier.visionapirest.mappers.PrixCatalogueMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PrixCatalogueRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/prixcatalogues")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PrixCatalogueResource extends GenericResource<PrixCatalogue, PrixCatalogueDTO, Long> {
    
    @Inject
    private PrixCatalogueRepository repository;
    
    @Inject
    private PrixCatalogueMapper mapper;
    
    @Override
    protected GenericRepository<PrixCatalogue, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PrixCatalogue, PrixCatalogueDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
