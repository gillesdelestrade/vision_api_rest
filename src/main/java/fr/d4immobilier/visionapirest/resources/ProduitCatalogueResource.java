package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ProduitCatalogueDTO;
import fr.d4immobilier.visionapirest.entities.ProduitCatalogue;
import fr.d4immobilier.visionapirest.mappers.ProduitCatalogueMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ProduitCatalogueRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/produitcatalogues")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProduitCatalogueResource extends GenericResource<ProduitCatalogue, ProduitCatalogueDTO, Long> {
    
    @Inject
    private ProduitCatalogueRepository repository;
    
    @Inject
    private ProduitCatalogueMapper mapper;
    
    @Override
    protected GenericRepository<ProduitCatalogue, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ProduitCatalogue, ProduitCatalogueDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
