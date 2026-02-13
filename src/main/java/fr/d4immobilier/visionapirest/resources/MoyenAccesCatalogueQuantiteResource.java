package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MoyenAccesCatalogueQuantiteDTO;
import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogueQuantite;
import fr.d4immobilier.visionapirest.mappers.MoyenAccesCatalogueQuantiteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MoyenAccesCatalogueQuantiteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/moyenaccescataloguequantites")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MoyenAccesCatalogueQuantiteResource extends GenericResource<MoyenAccesCatalogueQuantite, MoyenAccesCatalogueQuantiteDTO, Long> {
    
    @Inject
    private MoyenAccesCatalogueQuantiteRepository repository;
    
    @Inject
    private MoyenAccesCatalogueQuantiteMapper mapper;
    
    @Override
    protected GenericRepository<MoyenAccesCatalogueQuantite, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MoyenAccesCatalogueQuantite, MoyenAccesCatalogueQuantiteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
