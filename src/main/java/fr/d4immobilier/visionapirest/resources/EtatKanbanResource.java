package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EtatKanbanDTO;
import fr.d4immobilier.visionapirest.entities.EtatKanban;
import fr.d4immobilier.visionapirest.mappers.EtatKanbanMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EtatKanbanRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/etatkanbans")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EtatKanbanResource extends GenericResource<EtatKanban, EtatKanbanDTO, Long> {
    
    @Inject
    private EtatKanbanRepository repository;
    
    @Inject
    private EtatKanbanMapper mapper;
    
    @Override
    protected GenericRepository<EtatKanban, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<EtatKanban, EtatKanbanDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
