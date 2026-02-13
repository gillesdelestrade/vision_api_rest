package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.HonorairesSurTravauxDTO;
import fr.d4immobilier.visionapirest.entities.HonorairesSurTravaux;
import fr.d4immobilier.visionapirest.mappers.HonorairesSurTravauxMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.HonorairesSurTravauxRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/honorairessurtravaux")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HonorairesSurTravauxResource extends GenericResource<HonorairesSurTravaux, HonorairesSurTravauxDTO, Long> {
    
    @Inject
    private HonorairesSurTravauxRepository repository;
    
    @Inject
    private HonorairesSurTravauxMapper mapper;
    
    @Override
    protected GenericRepository<HonorairesSurTravaux, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<HonorairesSurTravaux, HonorairesSurTravauxDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
