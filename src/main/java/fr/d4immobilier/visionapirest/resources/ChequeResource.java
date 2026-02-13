package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ChequeDTO;
import fr.d4immobilier.visionapirest.entities.Cheque;
import fr.d4immobilier.visionapirest.mappers.ChequeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.ChequeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/cheques")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ChequeResource extends GenericResource<Cheque, ChequeDTO, Long> {
    
    @Inject
    private ChequeRepository repository;
    
    @Inject
    private ChequeMapper mapper;
    
    @Override
    protected GenericRepository<Cheque, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Cheque, ChequeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
