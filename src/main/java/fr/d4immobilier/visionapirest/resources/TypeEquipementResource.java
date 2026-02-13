package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TypeEquipementDTO;
import fr.d4immobilier.visionapirest.entities.TypeEquipement;
import fr.d4immobilier.visionapirest.mappers.TypeEquipementMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.TypeEquipementRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/typeequipements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TypeEquipementResource extends GenericResource<TypeEquipement, TypeEquipementDTO, Long> {
    
    @Inject
    private TypeEquipementRepository repository;
    
    @Inject
    private TypeEquipementMapper mapper;
    
    @Override
    protected GenericRepository<TypeEquipement, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<TypeEquipement, TypeEquipementDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
