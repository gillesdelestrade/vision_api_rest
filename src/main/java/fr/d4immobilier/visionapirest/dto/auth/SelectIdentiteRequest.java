package fr.d4immobilier.visionapirest.dto.auth;

import fr.d4immobilier.visionapirest.security.Role;

public class SelectIdentiteRequest {
    private String sessionToken;
    private Role role;
    private Long userId;
    
    public SelectIdentiteRequest() {}
    
    // Getters et Setters
    
    public String getSessionToken() {
        return sessionToken;
    }
    
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    
    public Role getRole() {
        return role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}