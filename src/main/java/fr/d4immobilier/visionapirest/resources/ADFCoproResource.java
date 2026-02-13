package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ADFCoproDTO;
import fr.d4immobilier.visionapirest.entities.ADFCopro;
import fr.d4immobilier.visionapirest.mappers.ADFCoproMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ADFCoproRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/adfcopros")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ADFCoproResource extends GenericResource<ADFCopro, ADFCoproDTO, Long> {
    
    @Inject
    private ADFCoproRepository repository;
    
    @Inject
    private ADFCoproMapper mapper;
    
    @Override
    protected GenericRepository<ADFCopro, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<ADFCopro, ADFCoproDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
