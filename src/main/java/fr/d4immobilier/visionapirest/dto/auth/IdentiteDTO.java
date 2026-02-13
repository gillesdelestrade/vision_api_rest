package fr.d4immobilier.visionapirest.dto.auth;

import fr.d4immobilier.visionapirest.security.Role;

public class IdentiteDTO {
    private Role role;
    private Long userId;
    private String nom;
    private String typeEntite; // "Gestionnaire", "Fournisseur", "CoproprietairePersonne", "CoproprietaireSociete"
    
    public IdentiteDTO() {}
    
    public IdentiteDTO(Role role, Long userId, String nom, String typeEntite) {
        this.role = role;
        this.userId = userId;
        this.nom = nom;
        this.typeEntite = typeEntite;
    }
    
    // Getters et Setters
    
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
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getTypeEntite() {
        return typeEntite;
    }
    
    public void setTypeEntite(String typeEntite) {
        this.typeEntite = typeEntite;
    }
}