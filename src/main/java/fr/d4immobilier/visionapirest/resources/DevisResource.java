// DevisResource.java
package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.DevisCloturesResponseDTO;
import fr.d4immobilier.visionapirest.dto.DevisEnCoursResponseDTO;
import fr.d4immobilier.visionapirest.services.DevisEnCoursService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/coproprietes/{coproprieteId}/devis")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class DevisResource {

    @Inject
    private DevisEnCoursService devisEnCoursService;

    @GET
    @Path("/en-cours")
    public DevisEnCoursResponseDTO getDevisEnCours(
            @PathParam("coproprieteId") Long coproprieteId) {
        return devisEnCoursService.findDevisEnCours(coproprieteId);
    }
    
    @GET
@Path("/clotures")
public DevisCloturesResponseDTO getDevisClotures(
        @PathParam("coproprieteId") Long coproprieteId,
        @QueryParam("anneeDebut") int anneeDebut,
        @QueryParam("anneeFin") int anneeFin) {
    return devisEnCoursService.findDevisClotures(coproprieteId, anneeDebut, anneeFin);
}
}