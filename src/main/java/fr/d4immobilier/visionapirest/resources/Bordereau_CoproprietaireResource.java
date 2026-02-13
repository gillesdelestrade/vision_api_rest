package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.Bordereau_CoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.Bordereau_Coproprietaire;
import fr.d4immobilier.visionapirest.mappers.Bordereau_CoproprietaireMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.Bordereau_CoproprietaireRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/bordereau_coproprietaires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Bordereau_CoproprietaireResource extends GenericResource<Bordereau_Coproprietaire, Bordereau_CoproprietaireDTO, Long> {
    
    @Inject
    private Bordereau_CoproprietaireRepository repository;
    
    @Inject
    private Bordereau_CoproprietaireMapper mapper;
    
    @Override
    protected GenericRepository<Bordereau_Coproprietaire, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Bordereau_Coproprietaire, Bordereau_CoproprietaireDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
