package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DossierContentieuxFactureDTO;
import fr.d4immobilier.visionapirest.entities.DossierContentieuxFacture;
import fr.d4immobilier.visionapirest.mappers.DossierContentieuxFactureMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DossierContentieuxFactureRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/dossiercontentieuxfactures")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DossierContentieuxFactureResource extends GenericResource<DossierContentieuxFacture, DossierContentieuxFactureDTO, Long> {
    
    @Inject
    private DossierContentieuxFactureRepository repository;
    
    @Inject
    private DossierContentieuxFactureMapper mapper;
    
    @Override
    protected GenericRepository<DossierContentieuxFacture, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DossierContentieuxFacture, DossierContentieuxFactureDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
