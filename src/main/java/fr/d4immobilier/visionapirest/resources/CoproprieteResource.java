package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BudgetDepensesDTO;
import fr.d4immobilier.visionapirest.dto.ConseilSyndicalDTO;
import fr.d4immobilier.visionapirest.dto.CoproprieteDTO;
import fr.d4immobilier.visionapirest.dto.DemandesEnCoursDTO;
import fr.d4immobilier.visionapirest.dto.FeuillePresenceDTO;
import fr.d4immobilier.visionapirest.dto.ReunionResumeDTO;
import fr.d4immobilier.visionapirest.entities.Copropriete;
import fr.d4immobilier.visionapirest.mappers.CoproprieteMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.CoproprieteRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import fr.d4immobilier.visionapirest.services.BudgetDepensesService;
import fr.d4immobilier.visionapirest.services.ConseilSyndicalService;
import fr.d4immobilier.visionapirest.services.DemandesEnCoursService;
import fr.d4immobilier.visionapirest.services.FeuillePresenceService;
import fr.d4immobilier.visionapirest.services.ReunionService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/coproprietes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CoproprieteResource extends GenericResource<Copropriete, CoproprieteDTO, Long> {

    @Inject
    private CoproprieteRepository repository;

    @Inject
    private BudgetDepensesService budgetDepensesService;

    @Inject
    private CoproprieteMapper mapper;

    @Inject
    private ReunionService reunionService;

    @Override
    protected GenericRepository<Copropriete, Long> getRepository() {
        return repository;
    }

    @Override
    protected GenericMapper<Copropriete, CoproprieteDTO> getMapper() {
        return mapper;
    }

    // Ajoutez ici des endpoints spécifiques si nécessaire
    /**
     * Récupère les copropriétés clientes d'un gestionnaire GET
     * /api/coproprietes/gestionnaire/{id}/clients
     *
     * @param gestionnaireId
     * @return
     */
    @GET
    @Path("/gestionnaire/{gestionnaireId}/clients")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getClientsByGestionnaire(@PathParam("gestionnaireId") Long gestionnaireId) {
        List<Copropriete> coproprietes = repository.findClientsByGestionnaireId(gestionnaireId);
        List<CoproprieteDTO> dtos = coproprietes.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());

        return Response.ok(dtos).build();
    }

    /**
     * Récupère le budget et les dépenses mensuelles d'une copropriété GET
     * /api/coproprietes/{id}/budget-depenses
     */
    @GET
    @Path("/{id}/budget-depenses")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBudgetDepenses(@PathParam("id") Long id) {
        List<BudgetDepensesDTO> budgetDepenses
                = budgetDepensesService.getBudgetDepenses(id);

        if (budgetDepenses.isEmpty()) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("{\"error\":\"Aucun budget trouvé pour cette copropriété\"}")
                    .build();
        }

        return Response.ok(budgetDepenses).build();
    }

    /**
     * Récupère les réunions d'une copropriété (Reunion + ReunionV2) GET
     * /api/coproprietes/{id}/reunions
     */
    @GET
    @Path("/{id}/reunions")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getReunions(@PathParam("id") Long id) {
        List<ReunionResumeDTO> reunions = reunionService.findByCoproprieteId(id);
        return Response.ok(reunions).build();
    }

    @Inject
    private ConseilSyndicalService conseilSyndicalService;

    @GET
    @Path("/{coproprieteId}/conseil-syndical")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getConseilSyndical(@PathParam("coproprieteId") Long coproprieteId) {
        System.out.println("je rentre dans getConseilSyndical(@PathParam(\"coproprieteId\") Long coproprieteId)");
        ConseilSyndicalDTO dto = conseilSyndicalService.getConseilSyndicalAvecBatiments(coproprieteId);
        return Response.ok(dto).build();
    }

    /**
     * Récupère les copropriétés clientes non gérées par un gestionnaire GET
     * /api/coproprietes/gestionnaire/{gestionnaireId}/clients-non-geres
     */
    @GET
    @Path("/gestionnaire/{gestionnaireId}/clients-non-geres")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getClientsNonGeres(@PathParam("gestionnaireId") Long gestionnaireId) {
        List<Copropriete> coproprietes = repository.findClientsNonGeresByGestionnaireId(gestionnaireId);
        List<CoproprieteDTO> dtos = coproprietes.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());

        return Response.ok(dtos).build();
    }

    @Inject
    private FeuillePresenceService feuillePresenceService;

    /**
     * Feuille de présence d'une copropriété GET
     * /api/coproprietes/{id}/feuille-presence
     */
    @GET
    @Path("/{id}/feuille-presence")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFeuillePresence(@PathParam("id") Long id) {
        FeuillePresenceDTO feuille = feuillePresenceService.getFeuillePresence(id);
        return Response.ok(feuille).build();
    }

    @Inject
    private DemandesEnCoursService demandesEnCoursService;

    /**
     * Demandes et actions en cours d'une copropriété GET
     * /api/coproprietes/{id}/demandes-en-cours
     */
    @GET
    @Path("/{id}/demandes-en-cours")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDemandesEnCours(@PathParam("id") Long id) {
        DemandesEnCoursDTO result = demandesEnCoursService.getDemandesEnCours(id);
        return Response.ok(result).build();
    }
}
