package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeDemandeDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeDemande;
import fr.d4immobilier.visionapirest.mappers.ProchaineEtapeDemandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ProchaineEtapeDemandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/prochaineetapedemandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProchaineEtapeDemandeResource extends GenericResource<ProchaineEtapeDemande, ProchaineEtapeDemandeDTO, Long> {
    
    @Inject
    private ProchaineEtapeDemandeRepository repository;
    
    @Inject
    private ProchaineEtapeDemandeMapper mapper;
    
    @Override
    protected GenericRepository<ProchaineEtapeDemande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ProchaineEtapeDemande, ProchaineEtapeDemandeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
