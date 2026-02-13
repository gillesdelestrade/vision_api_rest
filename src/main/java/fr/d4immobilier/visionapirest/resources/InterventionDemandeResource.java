package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.InterventionDemandeDTO;
import fr.d4immobilier.visionapirest.dto.InterventionDemandeResumeDTO;
import fr.d4immobilier.visionapirest.entities.InterventionDemande;
import fr.d4immobilier.visionapirest.mappers.InterventionDemandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.InterventionDemandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import fr.d4immobilier.visionapirest.services.InterventionDemandeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/interventiondemandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InterventionDemandeResource extends GenericResource<InterventionDemande, InterventionDemandeDTO, Long> {
    
    @Inject
    private InterventionDemandeRepository repository;
    
    @Inject
    private InterventionDemandeMapper mapper;
    
    @Override
    protected GenericRepository<InterventionDemande, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<InterventionDemande, InterventionDemandeDTO> getMapper() {
        return mapper;
    }
    
    /**
     * Récupère les 5 dernières interventions en cours pour une copropriété
     * GET /api/interventiondemandes/copropriete/{coproprieteId}/en-cours
     * @param coproprieteId
     * @return 
     */
    @GET
    @Path("/copropriete/{coproprieteId}/en-cours")
    public Response getEnCoursByCopropriete(@PathParam("coproprieteId") Long coproprieteId) {
        List<InterventionDemandeResumeDTO> interventions = 
            repository.findEnCoursByCoproprieteId(coproprieteId);
        
        return Response.ok(interventions).build();
    }
    
    @GET
    @Path("/copropriete/{coproprieteId}/en-cours-all")
    public Response getAllEnCoursByCopropriete(@PathParam("coproprieteId") Long coproprieteId) {
        List<InterventionDemandeResumeDTO> interventions = 
            repository.findAllEnCoursByCoproprieteId(coproprieteId);
        
        return Response.ok(interventions).build();
    }
    
    @Inject
    private InterventionDemandeService service;

    @GET
    @Path("/{id}")
    public Response getDetail(@PathParam("id") Long id) {
        return service.getDetail(id)
                .map(Response::ok)
                .orElse(Response.status(Response.Status.NOT_FOUND)
                        .entity("{\"message\":\"Intervention non trouvée\"}"))
                .build();
    }
    
    
    
   
    @GET
    @Path("/{coproprieteId}/interventions/terminees")
    public Response getTerminees(@PathParam("coproprieteId") Long coproprieteId) {
        var result = service.getTermineesParFournisseur(coproprieteId);
        if (result.groupes().isEmpty()) {
            return Response.noContent().build();
        }
        return Response.ok(result).build();
    }
    
}
