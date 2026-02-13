package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EtapeConsigneDTO;
import fr.d4immobilier.visionapirest.entities.EtapeConsigne;
import fr.d4immobilier.visionapirest.mappers.EtapeConsigneMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EtapeConsigneRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/etapeconsignes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EtapeConsigneResource extends GenericResource<EtapeConsigne, EtapeConsigneDTO, Long> {
    
    @Inject
    private EtapeConsigneRepository repository;
    
    @Inject
    private EtapeConsigneMapper mapper;
    
    @Override
    protected GenericRepository<EtapeConsigne, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EtapeConsigne, EtapeConsigneDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
