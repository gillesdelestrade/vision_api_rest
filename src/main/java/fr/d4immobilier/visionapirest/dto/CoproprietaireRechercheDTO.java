package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public class CoproprietaireRechercheDTO {
    
    private Long id;
    private String nom;
    private String email;
    private String type; // "Personne" ou "Societe"
    private List<LotResumeDTO> lots;
    
    public CoproprietaireRechercheDTO() {}
    
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public List<LotResumeDTO> getLots() {
        return lots;
    }
    
    public void setLots(List<LotResumeDTO> lots) {
        this.lots = lots;
    }
}