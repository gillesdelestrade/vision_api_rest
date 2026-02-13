package fr.d4immobilier.visionapirest.dto.auth;

import fr.d4immobilier.visionapirest.security.Role;
import java.util.List;

public class UserInfoDTO {
    
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private Role role;
    private List<CoproprieteCoproprietaireDTO> coproprietes; // Uniquement pour COPROPRIETAIRE
    
    public UserInfoDTO() {}
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
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
    
    public List<CoproprieteCoproprietaireDTO> getCoproprietes() {
        return coproprietes;
    }
    
    public void setCoproprietes(List<CoproprieteCoproprietaireDTO> coproprietes) {
        this.coproprietes = coproprietes;
    }
}