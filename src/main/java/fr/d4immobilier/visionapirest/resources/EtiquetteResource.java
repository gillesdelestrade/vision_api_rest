package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EtiquetteDTO;
import fr.d4immobilier.visionapirest.entities.Etiquette;
import fr.d4immobilier.visionapirest.mappers.EtiquetteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EtiquetteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/etiquettes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EtiquetteResource extends GenericResource<Etiquette, EtiquetteDTO, Long> {
    
    @Inject
    private EtiquetteRepository repository;
    
    @Inject
    private EtiquetteMapper mapper;
    
    @Override
    protected GenericRepository<Etiquette, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Etiquette, EtiquetteDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
