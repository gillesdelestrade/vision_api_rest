package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MoyenAccesCatalogueDTO;
import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogue;
import fr.d4immobilier.visionapirest.mappers.MoyenAccesCatalogueMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MoyenAccesCatalogueRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/moyenaccescatalogues")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MoyenAccesCatalogueResource extends GenericResource<MoyenAccesCatalogue, MoyenAccesCatalogueDTO, Long> {
    
    @Inject
    private MoyenAccesCatalogueRepository repository;
    
    @Inject
    private MoyenAccesCatalogueMapper mapper;
    
    @Override
    protected GenericRepository<MoyenAccesCatalogue, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MoyenAccesCatalogue, MoyenAccesCatalogueDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
