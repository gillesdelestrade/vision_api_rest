package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanqueFournisseur;
import fr.d4immobilier.visionapirest.mappers.CompteEnBanqueFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CompteEnBanqueFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/compteenbanquefournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CompteEnBanqueFournisseurResource extends GenericResource<CompteEnBanqueFournisseur, CompteEnBanqueFournisseurDTO, Long> {
    
    @Inject
    private CompteEnBanqueFournisseurRepository repository;
    
    @Inject
    private CompteEnBanqueFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<CompteEnBanqueFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CompteEnBanqueFournisseur, CompteEnBanqueFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
