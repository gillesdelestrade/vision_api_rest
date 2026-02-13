// FactureResource.java
package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.FacturesResponseDTO;
import fr.d4immobilier.visionapirest.services.FactureService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/coproprietes/{coproprieteId}/factures")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class FactureResource {

    @Inject
    private FactureService factureService;

    @GET
    public Object getFactures(
            @PathParam("coproprieteId") Long coproprieteId,
            @QueryParam("statut") String statut) {
        return switch (statut) {
            case "a_viser" -> factureService.findFacturesAViser(coproprieteId);
            case "visees" -> factureService.findFacturesVisees(coproprieteId);
            case "payees" -> factureService.findFacturesPayees(coproprieteId);
            case "rejetees" -> factureService.findFacturesRejetees(coproprieteId);
            default -> throw new BadRequestException("Statut invalide: " + statut);
        };
    }
}