package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MandataireDTO;
import fr.d4immobilier.visionapirest.entities.Mandataire;
import fr.d4immobilier.visionapirest.mappers.MandataireMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MandataireRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/mandataires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MandataireResource extends GenericResource<Mandataire, MandataireDTO, Long> {
    
    @Inject
    private MandataireRepository repository;
    
    @Inject
    private MandataireMapper mapper;
    
    @Override
    protected GenericRepository<Mandataire, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Mandataire, MandataireDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
