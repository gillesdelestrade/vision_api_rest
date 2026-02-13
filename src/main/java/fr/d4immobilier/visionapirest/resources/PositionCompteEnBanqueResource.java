package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PositionCompteDTO;
import fr.d4immobilier.visionapirest.dto.PositionCompteEnBanqueDTO;
import fr.d4immobilier.visionapirest.entities.PositionCompteEnBanque;
import fr.d4immobilier.visionapirest.mappers.PositionCompteEnBanqueMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.PositionCompteEnBanqueRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/positioncompteenbanques")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PositionCompteEnBanqueResource extends GenericResource<PositionCompteEnBanque, PositionCompteEnBanqueDTO, Long> {

    @Inject
    private PositionCompteEnBanqueRepository repository;

    @Inject
    private PositionCompteEnBanqueMapper mapper;

    @Override
    protected GenericRepository<PositionCompteEnBanque, Long> getRepository() {
        return repository;
    }

    @Override
    protected GenericMapper<PositionCompteEnBanque, PositionCompteEnBanqueDTO> getMapper() {
        return mapper;
    }

    /**
     * Récupère les 90 dernières positions du compte bancaire d'une copropriété
     * GET
     * /api/positioncompteenbanques/copropriete/{coproprieteId}/dernières-positions
     */
    @GET
    @Path("/copropriete/{coproprieteId}/dernieres-positions")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDernieresPositions(@PathParam("coproprieteId") Long coproprieteId) {
        List<PositionCompteDTO> positions
                = repository.findLastPositionsByCoproprieteId(coproprieteId);

        return Response.ok(positions).build();
    }
}
