package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BonDeCommandePanierMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommandePanierMoyenAcces;
import fr.d4immobilier.visionapirest.mappers.BonDeCommandePanierMoyenAccesMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BonDeCommandePanierMoyenAccesRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/bondecommandepaniermoyenacces")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BonDeCommandePanierMoyenAccesResource extends GenericResource<BonDeCommandePanierMoyenAcces, BonDeCommandePanierMoyenAccesDTO, Long> {
    
    @Inject
    private BonDeCommandePanierMoyenAccesRepository repository;
    
    @Inject
    private BonDeCommandePanierMoyenAccesMapper mapper;
    
    @Override
    protected GenericRepository<BonDeCommandePanierMoyenAcces, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<BonDeCommandePanierMoyenAcces, BonDeCommandePanierMoyenAccesDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
