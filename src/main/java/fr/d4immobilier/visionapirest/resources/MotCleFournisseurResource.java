package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MotCleFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.MotCleFournisseur;
import fr.d4immobilier.visionapirest.mappers.MotCleFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MotCleFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/motclefournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MotCleFournisseurResource extends GenericResource<MotCleFournisseur, MotCleFournisseurDTO, Long> {
    
    @Inject
    private MotCleFournisseurRepository repository;
    
    @Inject
    private MotCleFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<MotCleFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MotCleFournisseur, MotCleFournisseurDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
