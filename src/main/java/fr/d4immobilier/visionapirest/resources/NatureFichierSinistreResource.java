package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.NatureFichierSinistreDTO;
import fr.d4immobilier.visionapirest.entities.NatureFichierSinistre;
import fr.d4immobilier.visionapirest.mappers.NatureFichierSinistreMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.NatureFichierSinistreRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/naturefichiersinistres")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NatureFichierSinistreResource extends GenericResource<NatureFichierSinistre, NatureFichierSinistreDTO, Long> {
    
    @Inject
    private NatureFichierSinistreRepository repository;
    
    @Inject
    private NatureFichierSinistreMapper mapper;
    
    @Override
    protected GenericRepository<NatureFichierSinistre, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<NatureFichierSinistre, NatureFichierSinistreDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
