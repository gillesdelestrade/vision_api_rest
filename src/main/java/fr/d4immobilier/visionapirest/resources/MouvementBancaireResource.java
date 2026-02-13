package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MouvementBancaireDTO;
import fr.d4immobilier.visionapirest.entities.MouvementBancaire;
import fr.d4immobilier.visionapirest.mappers.MouvementBancaireMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MouvementBancaireRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/mouvementbancaires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MouvementBancaireResource extends GenericResource<MouvementBancaire, MouvementBancaireDTO, Long> {
    
    @Inject
    private MouvementBancaireRepository repository;
    
    @Inject
    private MouvementBancaireMapper mapper;
    
    @Override
    protected GenericRepository<MouvementBancaire, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MouvementBancaire, MouvementBancaireDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
