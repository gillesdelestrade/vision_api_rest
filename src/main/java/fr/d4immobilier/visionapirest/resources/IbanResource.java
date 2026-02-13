package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.IbanDTO;
import fr.d4immobilier.visionapirest.entities.Iban;
import fr.d4immobilier.visionapirest.mappers.IbanMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.IbanRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/ibans")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IbanResource extends GenericResource<Iban, IbanDTO, Long> {
    
    @Inject
    private IbanRepository repository;
    
    @Inject
    private IbanMapper mapper;
    
    @Override
    protected GenericRepository<Iban, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Iban, IbanDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
