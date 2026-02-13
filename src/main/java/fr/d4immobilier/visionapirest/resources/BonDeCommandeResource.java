package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BonDeCommandeDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommande;
import fr.d4immobilier.visionapirest.mappers.BonDeCommandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BonDeCommandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/bondecommandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BonDeCommandeResource extends GenericResource<BonDeCommande, BonDeCommandeDTO, Long> {
    
    @Inject
    private BonDeCommandeRepository repository;
    
    @Inject
    private BonDeCommandeMapper mapper;
    
    @Override
    protected GenericRepository<BonDeCommande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<BonDeCommande, BonDeCommandeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
