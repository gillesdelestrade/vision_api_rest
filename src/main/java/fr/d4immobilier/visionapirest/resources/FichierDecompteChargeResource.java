package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FichierDecompteChargeDTO;
import fr.d4immobilier.visionapirest.entities.FichierDecompteCharge;
import fr.d4immobilier.visionapirest.mappers.FichierDecompteChargeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.FichierDecompteChargeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fichierdecomptecharges")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FichierDecompteChargeResource extends GenericResource<FichierDecompteCharge, FichierDecompteChargeDTO, Long> {
    
    @Inject
    private FichierDecompteChargeRepository repository;
    
    @Inject
    private FichierDecompteChargeMapper mapper;
    
    @Override
    protected GenericRepository<FichierDecompteCharge, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<FichierDecompteCharge, FichierDecompteChargeDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
