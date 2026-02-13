package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.MatriculeICSDTO;
import fr.d4immobilier.visionapirest.dto.MatriculeICSUrlDTO;
import fr.d4immobilier.visionapirest.entities.MatriculeICS;
import fr.d4immobilier.visionapirest.mappers.MatriculeICSMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.MatriculeICSRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/matriculeics")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MatriculeICSResource extends GenericResource<MatriculeICS, MatriculeICSDTO, Long> {
    
    @Inject
    private MatriculeICSRepository repository;
    
    @Inject
    private MatriculeICSMapper mapper;
    
    @Override
    protected GenericRepository<MatriculeICS, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<MatriculeICS, MatriculeICSDTO> getMapper() {
        return mapper;
    }



    @GET
    @Path("/{idCopropriete}/urls")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUrlsConnexion(@PathParam("idCopropriete") Long idCopropriete) {
        List<MatriculeICSUrlDTO> urls = repository.findByCopropriete(idCopropriete);
        if (urls.isEmpty()) {
            return Response.noContent().build();
        }
        return Response.ok(urls).build();
    }
}

