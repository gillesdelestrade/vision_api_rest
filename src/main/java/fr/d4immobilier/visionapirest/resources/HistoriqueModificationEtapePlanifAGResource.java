package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.HistoriqueModificationEtapePlanifAGDTO;
import fr.d4immobilier.visionapirest.entities.HistoriqueModificationEtapePlanifAG;
import fr.d4immobilier.visionapirest.mappers.HistoriqueModificationEtapePlanifAGMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.HistoriqueModificationEtapePlanifAGRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/historiquemodificationetapeplanifags")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HistoriqueModificationEtapePlanifAGResource extends GenericResource<HistoriqueModificationEtapePlanifAG, HistoriqueModificationEtapePlanifAGDTO, Long> {
    
    @Inject
    private HistoriqueModificationEtapePlanifAGRepository repository;
    
    @Inject
    private HistoriqueModificationEtapePlanifAGMapper mapper;
    
    @Override
    protected GenericRepository<HistoriqueModificationEtapePlanifAG, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<HistoriqueModificationEtapePlanifAG, HistoriqueModificationEtapePlanifAGDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
