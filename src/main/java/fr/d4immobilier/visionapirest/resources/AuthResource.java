package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.auth.*;
import fr.d4immobilier.visionapirest.security.AuthService;
import fr.d4immobilier.visionapirest.security.JwtService;
import fr.d4immobilier.visionapirest.security.UserPrincipal;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthResource {
    
    @Inject
    private AuthService authService;
    
    @Inject
    private JwtService jwtService;
    
    /**
 * Endpoint de connexion
 * POST /api/auth/login
 * 
 * Si une seule identité : retourne directement le token + user
 * Si plusieurs identités : retourne sessionToken + liste d'identités
 */
@POST
@Path("/login")
public Response login(LoginRequest request) {
    if (request.getLogin() == null || request.getPassword() == null) {
        return Response.status(Response.Status.BAD_REQUEST)
            .entity("{\"error\":\"Login et mot de passe requis\"}")
            .build();
    }
    
    LoginStepOneResponse stepOneResponse = authService.authenticateStepOne(
        request.getLogin(),
        request.getPassword()
    );
    
    if (stepOneResponse == null) {
        return Response.status(Response.Status.UNAUTHORIZED)
            .entity("{\"error\":\"Login ou mot de passe incorrect, ou compte inactif\"}")
            .build();
    }
    
    // Si une seule identité, retourner directement le token final
    if (stepOneResponse.getIdentites().size() == 1) {
        IdentiteDTO identite = stepOneResponse.getIdentites().get(0);
        
        LoginResponse loginResponse = authService.authenticateStepTwo(
            stepOneResponse.getSessionToken(),
            identite.getRole(),
            identite.getUserId()
        );
        
        if (loginResponse != null) {
            return Response.ok(loginResponse).build();
        }
    }
    
    // Plusieurs identités : retourner le choix
    return Response.ok(stepOneResponse).build();
}
    
    /**
     * Étape 2 : Sélection de l'identité
     * POST /api/auth/select-identity
     */
    @POST
    @Path("/select-identity")
    public Response selectIdentity(SelectIdentiteRequest request) {
        if (request.getSessionToken() == null || request.getRole() == null || request.getUserId() == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                .entity("{\"error\":\"sessionToken, role et userId requis\"}")
                .build();
        }
        
        LoginResponse response = authService.authenticateStepTwo(
            request.getSessionToken(),
            request.getRole(),
            request.getUserId()
        );
        
        if (response == null) {
            return Response.status(Response.Status.UNAUTHORIZED)
                .entity("{\"error\":\"Session invalide ou identité incorrecte\"}")
                .build();
        }
        
        return Response.ok(response).build();
    }
    
    /**
     * Endpoint pour vérifier le token et récupérer les infos utilisateur
     * GET /api/auth/me
     */
    @GET
    @Path("/me")
    public Response getCurrentUser(@Context HttpHeaders headers) {
        String authHeader = headers.getHeaderString(HttpHeaders.AUTHORIZATION);
        String token = jwtService.extractTokenFromHeader(authHeader);
        
        if (token == null || !jwtService.validateToken(token)) {
            return Response.status(Response.Status.UNAUTHORIZED)
                .entity("{\"error\":\"Token invalide ou expiré\"}")
                .build();
        }
        
        UserPrincipal user = jwtService.getUserFromToken(token);
        return Response.ok(user).build();
    }
}