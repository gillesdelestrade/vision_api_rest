package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.DevisFournisseur;
import fr.d4immobilier.visionapirest.mappers.DevisFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DevisFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/devisfournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DevisFournisseurResource extends GenericResource<DevisFournisseur, DevisFournisseurDTO, Long> {
    
    @Inject
    private DevisFournisseurRepository repository;
    
    @Inject
    private DevisFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<DevisFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DevisFournisseur, DevisFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
