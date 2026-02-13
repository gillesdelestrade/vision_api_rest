package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BoiteArchiveDTO;
import fr.d4immobilier.visionapirest.entities.BoiteArchive;
import fr.d4immobilier.visionapirest.mappers.BoiteArchiveMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BoiteArchiveRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/boitearchives")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BoiteArchiveResource extends GenericResource<BoiteArchive, BoiteArchiveDTO, Long> {
    
    @Inject
    private BoiteArchiveRepository repository;
    
    @Inject
    private BoiteArchiveMapper mapper;
    
    @Override
    protected GenericRepository<BoiteArchive, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<BoiteArchive, BoiteArchiveDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
