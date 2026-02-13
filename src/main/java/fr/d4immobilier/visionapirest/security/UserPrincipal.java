/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.d4immobilier.visionapirest.security;

public class UserPrincipal {
    private Long userId;
    private String email;
    private Role role;
    
    public UserPrincipal() {}
    
    public UserPrincipal(Long userId, String email, Role role) {
        this.userId = userId;
        this.email = email;
        this.role = role;
    }
    
    // Getters et Setters
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Role getRole() {
        return role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
}
