package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CompteEnBanquePersonneDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanquePersonne;
import fr.d4immobilier.visionapirest.mappers.CompteEnBanquePersonneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CompteEnBanquePersonneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/compteenbanquepersonnes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CompteEnBanquePersonneResource extends GenericResource<CompteEnBanquePersonne, CompteEnBanquePersonneDTO, Long> {
    
    @Inject
    private CompteEnBanquePersonneRepository repository;
    
    @Inject
    private CompteEnBanquePersonneMapper mapper;
    
    @Override
    protected GenericRepository<CompteEnBanquePersonne, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CompteEnBanquePersonne, CompteEnBanquePersonneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
