// DematerialisationResource.java
package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CoproprietaireDematDTO;
import fr.d4immobilier.visionapirest.services.DematerialisationService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/coproprietes/{coproprieteId}/dematerialisation")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class DematerialisationResource {

    @Inject
    private DematerialisationService dematerialisationService;

    @GET
    public List<CoproprietaireDematDTO> getAutorisationsDemat(
            @PathParam("coproprieteId") Long coproprieteId) {
        return dematerialisationService.findAutorisationsDemat(coproprieteId);
    }
}