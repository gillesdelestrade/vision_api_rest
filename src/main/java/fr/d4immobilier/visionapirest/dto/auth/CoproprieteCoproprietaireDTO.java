package fr.d4immobilier.visionapirest.dto.auth;

public class CoproprieteCoproprietaireDTO {
    
    private Long id;
    private String nom;
    private String trigramme;
    private String identifiantICS;
    private boolean estMembreConseilSyndical;
    
    public CoproprieteCoproprietaireDTO() {}
    
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
    
    public String getTrigramme() {
        return trigramme;
    }
    
    public void setTrigramme(String trigramme) {
        this.trigramme = trigramme;
    }
    
    public String getIdentifiantICS() {
        return identifiantICS;
    }
    
    public void setIdentifiantICS(String identifiantICS) {
        this.identifiantICS = identifiantICS;
    }
    
    public boolean isEstMembreConseilSyndical() {
        return estMembreConseilSyndical;
    }
    
    public void setEstMembreConseilSyndical(boolean estMembreConseilSyndical) {
        this.estMembreConseilSyndical = estMembreConseilSyndical;
    }
}