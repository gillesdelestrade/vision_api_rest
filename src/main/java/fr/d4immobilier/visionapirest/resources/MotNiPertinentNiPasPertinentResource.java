package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MotNiPertinentNiPasPertinentDTO;
import fr.d4immobilier.visionapirest.entities.MotNiPertinentNiPasPertinent;
import fr.d4immobilier.visionapirest.mappers.MotNiPertinentNiPasPertinentMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MotNiPertinentNiPasPertinentRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/motnipertinentnipaspertinents")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MotNiPertinentNiPasPertinentResource extends GenericResource<MotNiPertinentNiPasPertinent, MotNiPertinentNiPasPertinentDTO, Long> {
    
    @Inject
    private MotNiPertinentNiPasPertinentRepository repository;
    
    @Inject
    private MotNiPertinentNiPasPertinentMapper mapper;
    
    @Override
    protected GenericRepository<MotNiPertinentNiPasPertinent, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MotNiPertinentNiPasPertinent, MotNiPertinentNiPasPertinentDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
