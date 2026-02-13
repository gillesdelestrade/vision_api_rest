package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TagEvenement_EvenementDTO;
import fr.d4immobilier.visionapirest.entities.TagEvenement_Evenement;
import fr.d4immobilier.visionapirest.mappers.TagEvenement_EvenementMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TagEvenement_EvenementRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/tagevenement_evenements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TagEvenement_EvenementResource extends GenericResource<TagEvenement_Evenement, TagEvenement_EvenementDTO, Long> {
    
    @Inject
    private TagEvenement_EvenementRepository repository;
    
    @Inject
    private TagEvenement_EvenementMapper mapper;
    
    @Override
    protected GenericRepository<TagEvenement_Evenement, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<TagEvenement_Evenement, TagEvenement_EvenementDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
