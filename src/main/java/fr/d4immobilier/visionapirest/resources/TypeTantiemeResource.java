package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TypeTantiemeDTO;
import fr.d4immobilier.visionapirest.entities.TypeTantieme;
import fr.d4immobilier.visionapirest.mappers.TypeTantiemeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TypeTantiemeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/typetantiemes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TypeTantiemeResource extends GenericResource<TypeTantieme, TypeTantiemeDTO, Long> {
    
    @Inject
    private TypeTantiemeRepository repository;
    
    @Inject
    private TypeTantiemeMapper mapper;
    
    @Override
    protected GenericRepository<TypeTantieme, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<TypeTantieme, TypeTantiemeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
