package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.SymptomeTypeEquipementDTO;
import fr.d4immobilier.visionapirest.entities.SymptomeTypeEquipement;
import fr.d4immobilier.visionapirest.mappers.SymptomeTypeEquipementMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.SymptomeTypeEquipementRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/symptometypeequipements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SymptomeTypeEquipementResource extends GenericResource<SymptomeTypeEquipement, SymptomeTypeEquipementDTO, Long> {
    
    @Inject
    private SymptomeTypeEquipementRepository repository;
    
    @Inject
    private SymptomeTypeEquipementMapper mapper;
    
    @Override
    protected GenericRepository<SymptomeTypeEquipement, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<SymptomeTypeEquipement, SymptomeTypeEquipementDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
