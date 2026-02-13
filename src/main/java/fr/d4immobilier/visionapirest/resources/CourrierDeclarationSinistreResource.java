package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CourrierDeclarationSinistreDTO;
import fr.d4immobilier.visionapirest.entities.CourrierDeclarationSinistre;
import fr.d4immobilier.visionapirest.mappers.CourrierDeclarationSinistreMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CourrierDeclarationSinistreRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/courrierdeclarationsinistres")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourrierDeclarationSinistreResource extends GenericResource<CourrierDeclarationSinistre, CourrierDeclarationSinistreDTO, Long> {
    
    @Inject
    private CourrierDeclarationSinistreRepository repository;
    
    @Inject
    private CourrierDeclarationSinistreMapper mapper;
    
    @Override
    protected GenericRepository<CourrierDeclarationSinistre, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CourrierDeclarationSinistre, CourrierDeclarationSinistreDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
