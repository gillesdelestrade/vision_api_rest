package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.PageRequest;
import fr.d4immobilier.visionapirest.dto.PageResponse;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GenericResource<E, D, ID> {
    
    protected abstract GenericRepository<E, ID> getRepository();
    protected abstract GenericMapper<E, D> getMapper();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(
            @QueryParam("page") @DefaultValue("0") int page,
            @QueryParam("size") @DefaultValue("20") int size,
            @QueryParam("sort") String sort,
            @QueryParam("order") @DefaultValue("ASC") String order) {
        
        // Si aucun paramètre de pagination n'est fourni, retourner tout
        if (page == 0 && size == 20 && sort == null) {
            List<E> entities = getRepository().findAll();
            List<D> dtos = getMapper().toDTOList(entities);
            return Response.ok(dtos).build();
        }
        
        // Sinon, utiliser la pagination
        PageRequest pageRequest = new PageRequest(page, size, sort, order);
        PageResponse<E> pageResponse = getRepository().findAll(pageRequest);
        
        // Convertir en DTOs
        List<D> dtos = pageResponse.getContent().stream()
            .map(getMapper()::toDTO)
            .collect(Collectors.toList());
        
        PageResponse<D> dtoPageResponse = new PageResponse<>(
            dtos,
            pageResponse.getPage(),
            pageResponse.getSize(),
            pageResponse.getTotalElements()
        );
        
        return Response.ok(dtoPageResponse).build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") ID id) {
        return getRepository().findById(id)
            .map(getMapper()::toDTO)
            .map(dto -> Response.ok(dto).build())
            .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(D dto) {
        try {
            E entity = getMapper().toEntity(dto);
            E saved = getRepository().save(entity);
            D responseDto = getMapper().toDTO(saved);
            return Response.status(Response.Status.CREATED).entity(responseDto).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                .entity("{\"error\":\"" + e.getMessage() + "\"}")
                .build();
        }
    }
    
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(@PathParam("id") ID id, D dto) {
        if (!getRepository().findById(id).isPresent()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        try {
            E entity = getMapper().toEntity(dto);
            E updated = getRepository().save(entity);
            D responseDto = getMapper().toDTO(updated);
            return Response.ok(responseDto).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                .entity("{\"error\":\"" + e.getMessage() + "\"}")
                .build();
        }
    }
    
    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") ID id) {
        if (!getRepository().findById(id).isPresent()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        getRepository().delete(id);
        return Response.noContent().build();
    }
    
    @GET
    @Path("/count")
    @Produces(MediaType.APPLICATION_JSON)
    public Response count() {
        long count = getRepository().count();
        return Response.ok("{\"count\":" + count + "}").build();
    }
}