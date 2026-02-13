package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TireurChequeDTO;
import fr.d4immobilier.visionapirest.entities.TireurCheque;
import fr.d4immobilier.visionapirest.mappers.TireurChequeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TireurChequeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/tireurcheques")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TireurChequeResource extends GenericResource<TireurCheque, TireurChequeDTO, Long> {
    
    @Inject
    private TireurChequeRepository repository;
    
    @Inject
    private TireurChequeMapper mapper;
    
    @Override
    protected GenericRepository<TireurCheque, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<TireurCheque, TireurChequeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
