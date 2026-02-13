package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FactureFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.FactureFournisseur;
import fr.d4immobilier.visionapirest.mappers.FactureFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FactureFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/facturefournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FactureFournisseurResource extends GenericResource<FactureFournisseur, FactureFournisseurDTO, Long> {
    
    @Inject
    private FactureFournisseurRepository repository;
    
    @Inject
    private FactureFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<FactureFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FactureFournisseur, FactureFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
