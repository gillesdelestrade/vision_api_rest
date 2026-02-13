package fr.d4immobilier.visionapirest.dto.auth;

import java.util.List;

public class LoginStepOneResponse {
    private String sessionToken; // Token temporaire pour l'étape 2
    private List<IdentiteDTO> identites;
    
    public LoginStepOneResponse() {}
    
    public LoginStepOneResponse(String sessionToken, List<IdentiteDTO> identites) {
        this.sessionToken = sessionToken;
        this.identites = identites;
    }
    
    // Getters et Setters
    
    public String getSessionToken() {
        return sessionToken;
    }
    
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    
    public List<IdentiteDTO> getIdentites() {
        return identites;
    }
    
    public void setIdentites(List<IdentiteDTO> identites) {
        this.identites = identites;
    }
}