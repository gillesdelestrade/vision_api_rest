package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BanqueDTO;
import fr.d4immobilier.visionapirest.entities.Banque;
import fr.d4immobilier.visionapirest.mappers.BanqueMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BanqueRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/banques")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BanqueResource extends GenericResource<Banque, BanqueDTO, Long> {
    
    @Inject
    private BanqueRepository repository;
    
    @Inject
    private BanqueMapper mapper;
    
    @Override
    protected GenericRepository<Banque, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Banque, BanqueDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
