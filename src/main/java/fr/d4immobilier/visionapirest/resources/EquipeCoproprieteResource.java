// EquipeCoproprieteResource.java
package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.EquipeCoproprieteDTO;
import fr.d4immobilier.visionapirest.services.EquipeCoproprieteService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/coproprietes/{coproprieteId}/equipe")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class EquipeCoproprieteResource {

    @Inject
    private EquipeCoproprieteService equipeService;

    @GET
    public Response getEquipe(@PathParam("coproprieteId") Long coproprieteId) {
        EquipeCoproprieteDTO equipe = equipeService.findEquipe(coproprieteId);
        if (equipe == null) {
            return Response.status(Response.Status.NOT_FOUND)
                .entity(java.util.Map.of(
                    "error", "Copropriété non trouvée",
                    "idCopropriete", String.valueOf(coproprieteId)
                ))
                .build();
        }
        return Response.ok(equipe).build();
    }
}
