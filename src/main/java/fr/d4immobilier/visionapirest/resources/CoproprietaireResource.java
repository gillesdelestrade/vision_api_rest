package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.CoproprietaireByEmailDTO;
import fr.d4immobilier.visionapirest.dto.CoproprietaireDTO;
import fr.d4immobilier.visionapirest.dto.CoproprietaireRechercheDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.mappers.CoproprietaireMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CoproprietaireRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import fr.d4immobilier.visionapirest.services.CoproprietaireService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/coproprietaires")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CoproprietaireResource extends GenericResource<Coproprietaire, CoproprietaireDTO, Long> {
    
    @Inject
    private CoproprietaireRepository repository;
    
    @Inject
    private CoproprietaireMapper mapper;
    
    @Override
    protected GenericRepository<Coproprietaire, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Coproprietaire, CoproprietaireDTO> getMapper() {
        return mapper;
    }
    
    /**
     * Recherche les copropriétaires par adresse mail avec leurs lots et copropriétés
     * GET /api/coproprietaires/search-by-email?email=dupont@example.com
     */
    @GET
    @Path("/search-by-email")
    public Response searchByEmail(@QueryParam("email") String email) {
        System.out.println("email = " + email);
        if (email == null || email.trim().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST)
                .entity("{\"error\":\"Le paramètre email est requis\"}")
                .build();
        }
        
        List<CoproprietaireRechercheDTO> resultats = repository.findByEmail(email.trim());
        
        return Response.ok(resultats).build();
    }
    
    @Inject
    private CoproprietaireService coproprietaireService;

    @GET
    @Path("/by-email")
    public List<CoproprietaireByEmailDTO> findByEmail(
            @QueryParam("email") String email) {
        return coproprietaireService.findByEmail(email);
    }
}
