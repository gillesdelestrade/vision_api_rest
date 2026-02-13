package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CampagneADFDTO;
import fr.d4immobilier.visionapirest.entities.CampagneADF;
import fr.d4immobilier.visionapirest.mappers.CampagneADFMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CampagneADFRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/campagneadfs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CampagneADFResource extends GenericResource<CampagneADF, CampagneADFDTO, Long> {
    
    @Inject
    private CampagneADFRepository repository;
    
    @Inject
    private CampagneADFMapper mapper;
    
    @Override
    protected GenericRepository<CampagneADF, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CampagneADF, CampagneADFDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
