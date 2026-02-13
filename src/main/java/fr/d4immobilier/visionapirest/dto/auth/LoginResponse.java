package fr.d4immobilier.visionapirest.dto.auth;

import fr.d4immobilier.visionapirest.security.Role;
import java.util.List;

public class LoginResponse {
    
    private String token;
    private UserInfoDTO user;
    
    public LoginResponse() {}
    
    public LoginResponse(String token, UserInfoDTO user) {
        this.token = token;
        this.user = user;
    }
    
    // Getters et Setters
    
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    public UserInfoDTO getUser() {
        return user;
    }
    
    public void setUser(UserInfoDTO user) {
        this.user = user;
    }
}