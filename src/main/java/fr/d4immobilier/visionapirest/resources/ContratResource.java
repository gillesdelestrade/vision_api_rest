// ContratResource.java
package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.ContratsResponseDTO;
import fr.d4immobilier.visionapirest.services.ContratService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/coproprietes/{coproprieteId}/contrats")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class ContratResource {

    @Inject
    private ContratService contratService;

    @GET
    public ContratsResponseDTO getContrats(
            @PathParam("coproprieteId") Long coproprieteId) {
        return contratService.findContrats(coproprieteId);
    }
}