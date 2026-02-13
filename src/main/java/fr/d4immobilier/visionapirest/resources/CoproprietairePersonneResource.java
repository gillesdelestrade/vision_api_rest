package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CoproprietairePersonneDTO;
import fr.d4immobilier.visionapirest.entities.CoproprietairePersonne;
import fr.d4immobilier.visionapirest.mappers.CoproprietairePersonneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CoproprietairePersonneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/coproprietairepersonnes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CoproprietairePersonneResource extends GenericResource<CoproprietairePersonne, CoproprietairePersonneDTO, Long> {
    
    @Inject
    private CoproprietairePersonneRepository repository;
    
    @Inject
    private CoproprietairePersonneMapper mapper;
    
    @Override
    protected GenericRepository<CoproprietairePersonne, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CoproprietairePersonne, CoproprietairePersonneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
