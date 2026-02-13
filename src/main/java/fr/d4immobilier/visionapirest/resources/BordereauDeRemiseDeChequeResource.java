package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BordereauDeRemiseDeChequeDTO;
import fr.d4immobilier.visionapirest.entities.BordereauDeRemiseDeCheque;
import fr.d4immobilier.visionapirest.mappers.BordereauDeRemiseDeChequeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BordereauDeRemiseDeChequeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/bordereauderemisedecheques")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BordereauDeRemiseDeChequeResource extends GenericResource<BordereauDeRemiseDeCheque, BordereauDeRemiseDeChequeDTO, Long> {
    
    @Inject
    private BordereauDeRemiseDeChequeRepository repository;
    
    @Inject
    private BordereauDeRemiseDeChequeMapper mapper;
    
    @Override
    protected GenericRepository<BordereauDeRemiseDeCheque, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<BordereauDeRemiseDeCheque, BordereauDeRemiseDeChequeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
