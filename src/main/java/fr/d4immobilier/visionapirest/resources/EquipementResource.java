package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BatimentEquipementsDTO;
import fr.d4immobilier.visionapirest.dto.EquipementDTO;
import fr.d4immobilier.visionapirest.entities.Equipement;
import fr.d4immobilier.visionapirest.mappers.EquipementMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.EquipementRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import fr.d4immobilier.visionapirest.services.EquipementService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/coproprietes/{coproprieteId}/equipements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EquipementResource extends GenericResource<Equipement, EquipementDTO, Long> {
    
    @Inject
    private EquipementRepository repository;
    
    @Inject
    private EquipementMapper mapper;
    
    @Override
    protected GenericRepository<Equipement, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Equipement, EquipementDTO> getMapper() {
        return mapper;
    }
    
    @Inject
    private EquipementService equipementService;

    @GET
    @Path("/par-batiment")
    public List<BatimentEquipementsDTO> getEquipementsParBatiment(
            @PathParam("coproprieteId") Long coproprieteId) {
        return equipementService.findEquipementsGroupedByBatiment(coproprieteId);
    }
}
