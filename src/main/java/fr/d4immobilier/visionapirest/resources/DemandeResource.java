package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DemandeDTO;
import fr.d4immobilier.visionapirest.dto.DetailDemandeDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.mappers.DemandeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.DemandeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import fr.d4immobilier.visionapirest.security.JwtService;
import fr.d4immobilier.visionapirest.security.UserPrincipal;
import fr.d4immobilier.visionapirest.services.DetailDemandeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/demandes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemandeResource extends GenericResource<Demande, DemandeDTO, Long> {

    @Inject
    private DemandeRepository repository;

    @Inject
    private DemandeMapper mapper;

    @Override
    protected GenericRepository<Demande, Long> getRepository() {
        return repository;
    }

    @Override
    protected GenericMapper<Demande, DemandeDTO> getMapper() {
        return mapper;
    }

    @Inject
    private DetailDemandeService detailDemandeService;

    @Inject
    private JwtService jwtService;

    /**
     * Détail complet d'une demande. GET /api/demandes/{id}
     *
     * Reproduit la logique de DetailDemandeJSON servlet.
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDetailDemande(@PathParam("id") Long id,
            @HeaderParam("Authorization") String authHeader) {
        Long currentUserId = null;
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            UserPrincipal user = jwtService.getUserFromToken(authHeader.substring(7));
            if (user != null) {
                currentUserId = user.getUserId();
            }
        }
        DetailDemandeDTO detail = detailDemandeService.getDetailDemande(id, currentUserId);
        if (detail == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("{\"error\":\"Demande non trouvée\"}")
                    .build();
        }
        return Response.ok(detail).build();
    }
}
