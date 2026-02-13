package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PartChequeCoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.PartChequeCoproprietaire;
import fr.d4immobilier.visionapirest.mappers.PartChequeCoproprietaireMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PartChequeCoproprietaireRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/partchequecoproprietaires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PartChequeCoproprietaireResource extends GenericResource<PartChequeCoproprietaire, PartChequeCoproprietaireDTO, Long> {
    
    @Inject
    private PartChequeCoproprietaireRepository repository;
    
    @Inject
    private PartChequeCoproprietaireMapper mapper;
    
    @Override
    protected GenericRepository<PartChequeCoproprietaire, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PartChequeCoproprietaire, PartChequeCoproprietaireDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
