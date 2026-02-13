package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BonDeCommandeEmplacementBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommandeEmplacementBALInterphone;
import fr.d4immobilier.visionapirest.mappers.BonDeCommandeEmplacementBALInterphoneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BonDeCommandeEmplacementBALInterphoneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/bondecommandeemplacementbalinterphones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BonDeCommandeEmplacementBALInterphoneResource extends GenericResource<BonDeCommandeEmplacementBALInterphone, BonDeCommandeEmplacementBALInterphoneDTO, Long> {
    
    @Inject
    private BonDeCommandeEmplacementBALInterphoneRepository repository;
    
    @Inject
    private BonDeCommandeEmplacementBALInterphoneMapper mapper;
    
    @Override
    protected GenericRepository<BonDeCommandeEmplacementBALInterphone, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<BonDeCommandeEmplacementBALInterphone, BonDeCommandeEmplacementBALInterphoneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
