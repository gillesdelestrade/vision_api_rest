package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueCoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanqueCopropriete;
import fr.d4immobilier.visionapirest.mappers.CompteEnBanqueCoproprieteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CompteEnBanqueCoproprieteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/compteenbanquecoproprietes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CompteEnBanqueCoproprieteResource extends GenericResource<CompteEnBanqueCopropriete, CompteEnBanqueCoproprieteDTO, Long> {
    
    @Inject
    private CompteEnBanqueCoproprieteRepository repository;
    
    @Inject
    private CompteEnBanqueCoproprieteMapper mapper;
    
    @Override
    protected GenericRepository<CompteEnBanqueCopropriete, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CompteEnBanqueCopropriete, CompteEnBanqueCoproprieteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
