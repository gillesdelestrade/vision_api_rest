package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.AssembleeDTO;
import fr.d4immobilier.visionapirest.dto.AssembleeResumeDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.mappers.AssembleeMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.AssembleeRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/assemblees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AssembleeResource extends GenericResource<Assemblee, AssembleeDTO, Long> {
    
    @Inject
    private AssembleeRepository repository;
    
    @Inject
    private AssembleeMapper mapper;
    
    @Override
    protected GenericRepository<Assemblee, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Assemblee, AssembleeDTO> getMapper() {
        return mapper;
    }
    
    /**
 * Récupère les assemblées générales d'une copropriété
 * GET /api/assemblees/copropriete/{coproprieteId}
 */
@GET
@Path("/copropriete/{coproprieteId}")
@Produces(MediaType.APPLICATION_JSON)
public Response getByCopropriete(@PathParam("coproprieteId") Long coproprieteId) {
    List<AssembleeResumeDTO> assemblees = repository.findByCoproprieteId(coproprieteId);
    return Response.ok(assemblees).build();
}
}
