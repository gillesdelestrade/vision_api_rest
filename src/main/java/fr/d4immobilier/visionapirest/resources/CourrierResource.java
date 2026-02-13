// CourrierResource.java
package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AnneeCourriersDTO;
import fr.d4immobilier.visionapirest.services.CourrierService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/coproprietes/{coproprieteId}/courriers")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class CourrierResource {

    @Inject
    private CourrierService courrierService;

    @GET
    public List<AnneeCourriersDTO> getCourriers(
            @PathParam("coproprieteId") Long coproprieteId) {
        return courrierService.findCourriers(coproprieteId);
    }
}