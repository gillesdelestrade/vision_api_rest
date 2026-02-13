package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CoproprietaireCoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.CoproprietaireCopropriete;
import fr.d4immobilier.visionapirest.mappers.CoproprietaireCoproprieteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CoproprietaireCoproprieteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/coproprietairecoproprietes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CoproprietaireCoproprieteResource extends GenericResource<CoproprietaireCopropriete, CoproprietaireCoproprieteDTO, Long> {
    
    @Inject
    private CoproprietaireCoproprieteRepository repository;
    
    @Inject
    private CoproprietaireCoproprieteMapper mapper;
    
    @Override
    protected GenericRepository<CoproprietaireCopropriete, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CoproprietaireCopropriete, CoproprietaireCoproprieteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
