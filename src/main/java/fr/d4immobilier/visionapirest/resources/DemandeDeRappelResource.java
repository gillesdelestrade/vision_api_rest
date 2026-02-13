package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DemandeDeRappelDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDeRappel;
import fr.d4immobilier.visionapirest.mappers.DemandeDeRappelMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DemandeDeRappelRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/demandederappels")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemandeDeRappelResource extends GenericResource<DemandeDeRappel, DemandeDeRappelDTO, Long> {
    
    @Inject
    private DemandeDeRappelRepository repository;
    
    @Inject
    private DemandeDeRappelMapper mapper;
    
    @Override
    protected GenericRepository<DemandeDeRappel, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DemandeDeRappel, DemandeDeRappelDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
