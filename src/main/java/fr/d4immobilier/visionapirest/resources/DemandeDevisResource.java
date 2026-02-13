package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DemandeDevisDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevis;
import fr.d4immobilier.visionapirest.mappers.DemandeDevisMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DemandeDevisRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/demandedevis")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemandeDevisResource extends GenericResource<DemandeDevis, DemandeDevisDTO, Long> {
    
    @Inject
    private DemandeDevisRepository repository;
    
    @Inject
    private DemandeDevisMapper mapper;
    
    @Override
    protected GenericRepository<DemandeDevis, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DemandeDevis, DemandeDevisDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
