package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BonDeCommandeMaterielDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommandeMateriel;
import fr.d4immobilier.visionapirest.mappers.BonDeCommandeMaterielMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BonDeCommandeMaterielRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/bondecommandemateriels")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BonDeCommandeMaterielResource extends GenericResource<BonDeCommandeMateriel, BonDeCommandeMaterielDTO, Long> {
    
    @Inject
    private BonDeCommandeMaterielRepository repository;
    
    @Inject
    private BonDeCommandeMaterielMapper mapper;
    
    @Override
    protected GenericRepository<BonDeCommandeMateriel, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<BonDeCommandeMateriel, BonDeCommandeMaterielDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
