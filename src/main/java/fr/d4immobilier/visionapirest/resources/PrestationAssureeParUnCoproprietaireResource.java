package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PrestationAssureeParUnCoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.PrestationAssureeParUnCoproprietaire;
import fr.d4immobilier.visionapirest.mappers.PrestationAssureeParUnCoproprietaireMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PrestationAssureeParUnCoproprietaireRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/prestationassureeparuncoproprietaires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PrestationAssureeParUnCoproprietaireResource extends GenericResource<PrestationAssureeParUnCoproprietaire, PrestationAssureeParUnCoproprietaireDTO, Long> {
    
    @Inject
    private PrestationAssureeParUnCoproprietaireRepository repository;
    
    @Inject
    private PrestationAssureeParUnCoproprietaireMapper mapper;
    
    @Override
    protected GenericRepository<PrestationAssureeParUnCoproprietaire, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<PrestationAssureeParUnCoproprietaire, PrestationAssureeParUnCoproprietaireDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
