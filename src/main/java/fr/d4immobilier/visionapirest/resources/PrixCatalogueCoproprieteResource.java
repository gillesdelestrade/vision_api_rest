package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PrixCatalogueCoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.PrixCatalogueCopropriete;
import fr.d4immobilier.visionapirest.mappers.PrixCatalogueCoproprieteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PrixCatalogueCoproprieteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/prixcataloguecoproprietes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PrixCatalogueCoproprieteResource extends GenericResource<PrixCatalogueCopropriete, PrixCatalogueCoproprieteDTO, Long> {
    
    @Inject
    private PrixCatalogueCoproprieteRepository repository;
    
    @Inject
    private PrixCatalogueCoproprieteMapper mapper;
    
    @Override
    protected GenericRepository<PrixCatalogueCopropriete, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PrixCatalogueCopropriete, PrixCatalogueCoproprieteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
