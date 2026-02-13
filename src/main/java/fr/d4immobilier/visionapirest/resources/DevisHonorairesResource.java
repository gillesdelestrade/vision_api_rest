package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DevisHonorairesDTO;
import fr.d4immobilier.visionapirest.entities.DevisHonoraires;
import fr.d4immobilier.visionapirest.mappers.DevisHonorairesMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DevisHonorairesRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/devishonoraires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DevisHonorairesResource extends GenericResource<DevisHonoraires, DevisHonorairesDTO, Long> {
    
    @Inject
    private DevisHonorairesRepository repository;
    
    @Inject
    private DevisHonorairesMapper mapper;
    
    @Override
    protected GenericRepository<DevisHonoraires, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DevisHonoraires, DevisHonorairesDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
