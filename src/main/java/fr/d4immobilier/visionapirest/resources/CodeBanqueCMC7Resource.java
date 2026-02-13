package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CodeBanqueCMC7DTO;
import fr.d4immobilier.visionapirest.entities.CodeBanqueCMC7;
import fr.d4immobilier.visionapirest.mappers.CodeBanqueCMC7Mapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CodeBanqueCMC7Repository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/codebanquecmc7s")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CodeBanqueCMC7Resource extends GenericResource<CodeBanqueCMC7, CodeBanqueCMC7DTO, Long> {
    
    @Inject
    private CodeBanqueCMC7Repository repository;
    
    @Inject
    private CodeBanqueCMC7Mapper mapper;
    
    @Override
    protected GenericRepository<CodeBanqueCMC7, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<CodeBanqueCMC7, CodeBanqueCMC7DTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
