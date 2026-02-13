package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanque;
import fr.d4immobilier.visionapirest.mappers.CompteEnBanqueMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CompteEnBanqueRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/compteenbanques")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CompteEnBanqueResource extends GenericResource<CompteEnBanque, CompteEnBanqueDTO, Long> {
    
    @Inject
    private CompteEnBanqueRepository repository;
    
    @Inject
    private CompteEnBanqueMapper mapper;
    
    @Override
    protected GenericRepository<CompteEnBanque, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CompteEnBanque, CompteEnBanqueDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
