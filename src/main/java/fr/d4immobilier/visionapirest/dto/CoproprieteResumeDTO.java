package fr.d4immobilier.visionapirest.dto;

public class CoproprieteResumeDTO {
    
    private Long id;
    private String nom;
    private String trigramme;
    
    public CoproprieteResumeDTO() {}
    
    public CoproprieteResumeDTO(Long id, String nom, String trigramme) {
        this.id = id;
        this.nom = nom;
        this.trigramme = trigramme;
    }
    
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
}