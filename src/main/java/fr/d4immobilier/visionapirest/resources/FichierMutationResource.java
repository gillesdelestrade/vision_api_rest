// FichierMutationResource.java
package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.TypeFichierMutationDTO;
import fr.d4immobilier.visionapirest.services.FichierMutationService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/coproprietes/{coproprieteId}/fichiers-mutation")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class FichierMutationResource {

    @Inject
    private FichierMutationService fichierMutationService;

    @GET
    public List<TypeFichierMutationDTO> getFichiersMutation(
            @PathParam("coproprieteId") Long coproprieteId) {
        return fichierMutationService.findFichiersMutation(coproprieteId);
    }
}