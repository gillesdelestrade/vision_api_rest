package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EtapeDemandeDTO;
import fr.d4immobilier.visionapirest.entities.EtapeDemande;
import fr.d4immobilier.visionapirest.mappers.EtapeDemandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EtapeDemandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/etapedemandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EtapeDemandeResource extends GenericResource<EtapeDemande, EtapeDemandeDTO, Long> {
    
    @Inject
    private EtapeDemandeRepository repository;
    
    @Inject
    private EtapeDemandeMapper mapper;
    
    @Override
    protected GenericRepository<EtapeDemande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EtapeDemande, EtapeDemandeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
