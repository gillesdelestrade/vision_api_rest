package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DesistementChequeDTO;
import fr.d4immobilier.visionapirest.entities.DesistementCheque;
import fr.d4immobilier.visionapirest.mappers.DesistementChequeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DesistementChequeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/desistementcheques")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DesistementChequeResource extends GenericResource<DesistementCheque, DesistementChequeDTO, Long> {
    
    @Inject
    private DesistementChequeRepository repository;
    
    @Inject
    private DesistementChequeMapper mapper;
    
    @Override
    protected GenericRepository<DesistementCheque, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DesistementCheque, DesistementChequeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
