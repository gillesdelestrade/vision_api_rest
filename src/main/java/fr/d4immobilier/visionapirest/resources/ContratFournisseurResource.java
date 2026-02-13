package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ContratFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.ContratFournisseur;
import fr.d4immobilier.visionapirest.mappers.ContratFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ContratFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/contratfournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContratFournisseurResource extends GenericResource<ContratFournisseur, ContratFournisseurDTO, Long> {
    
    @Inject
    private ContratFournisseurRepository repository;
    
    @Inject
    private ContratFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<ContratFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ContratFournisseur, ContratFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
