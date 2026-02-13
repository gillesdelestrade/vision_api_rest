package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DemandeDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.dto.DemandeDevisFournisseurResumeDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevisFournisseur;
import fr.d4immobilier.visionapirest.mappers.DemandeDevisFournisseurMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DemandeDevisFournisseurRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/demandedevisfournisseurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemandeDevisFournisseurResource extends GenericResource<DemandeDevisFournisseur, DemandeDevisFournisseurDTO, Long> {
    
    @Inject
    private DemandeDevisFournisseurRepository repository;
    
    @Inject
    private DemandeDevisFournisseurMapper mapper;
    
    @Override
    protected GenericRepository<DemandeDevisFournisseur, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<DemandeDevisFournisseur, DemandeDevisFournisseurDTO> getMapper() {
        return mapper;
    }
    
    /**
 * Récupère les 5 dernières demandes de devis en cours pour une copropriété
 * GET /api/demandedevisfournisseurs/copropriete/{coproprieteId}/en-cours
 */
@GET
@Path("/copropriete/{coproprieteId}/en-cours")
@Produces(MediaType.APPLICATION_JSON)
public Response getEnCoursByCopropriete(@PathParam("coproprieteId") Long coproprieteId) {
    List<DemandeDevisFournisseurResumeDTO> demandes = 
        repository.findEnCoursByCoproprieteId(coproprieteId);
    
    return Response.ok(demandes).build();
}
}
