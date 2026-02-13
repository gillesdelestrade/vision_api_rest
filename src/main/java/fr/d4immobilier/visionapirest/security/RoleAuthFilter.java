package fr.d4immobilier.visionapirest.security;

import jakarta.annotation.Priority;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.ResourceInfo;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

@Provider
@Secured
@Priority(Priorities.AUTHORIZATION)
public class RoleAuthFilter implements ContainerRequestFilter {
    
    @Context
    private ResourceInfo resourceInfo;
    
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        Method method = resourceInfo.getResourceMethod();
        
        // Vérifier si la méthode a l'annotation @RolesAllowed
        if (method.isAnnotationPresent(RolesAllowed.class)) {
            RolesAllowed rolesAnnotation = method.getAnnotation(RolesAllowed.class);
            Role[] allowedRoles = rolesAnnotation.value();
            
            // Récupérer l'utilisateur du contexte (mis par JwtAuthFilter)
            UserPrincipal user = (UserPrincipal) requestContext.getProperty("user");
            
            if (user == null || !Arrays.asList(allowedRoles).contains(user.getRole())) {
                requestContext.abortWith(
                    Response.status(Response.Status.FORBIDDEN)
                        .entity("{\"error\":\"Accès refusé\"}")
                        .build()
                );
            }
        }
    }
}