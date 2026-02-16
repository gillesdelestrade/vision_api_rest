/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.d4immobilier.visionapirest.security;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
@Secured
@Priority(Priorities.AUTHENTICATION)
public class JwtAuthFilter implements ContainerRequestFilter {
    
    @Inject
    private JwtService jwtService;
    
    @Inject
    private AuthenticatedUser authenticatedUser;
    
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("=== JwtAuthFilter déclenché ===");
        String authHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
        System.out.println("=== Auth header: " + authHeader + " ===");
        String token = jwtService.extractTokenFromHeader(authHeader);
        
        if (token == null || !jwtService.validateToken(token)) {
            requestContext.abortWith(
                Response.status(Response.Status.UNAUTHORIZED)
                    .entity("{\"error\":\"Authentification requise\"}")
                    .build()
            );
            return;
        }
        
        // Récupérer l'utilisateur et le stocker dans le contexte
        
        UserPrincipal user = jwtService.getUserFromToken(token);        
        System.out.println("=== User extrait: " + user.getUserId() + " ===");
        authenticatedUser.setUser(user);
        System.out.println("=== AuthenticatedUser set, hash: " + System.identityHashCode(authenticatedUser) + " ===");
    }
}
