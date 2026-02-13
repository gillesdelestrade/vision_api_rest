package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CandidatureCSDTO {
    
    private Long id;
    private String nom;
    private String prenom;
    private Boolean estCandidat;
    private Long assembleeId;
    private Long coproprietaireId;
    private Long resolutionId;

    // Constructeur
    public CandidatureCSDTO() {
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

    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Boolean getEstCandidat() {
        return estCandidat;
    }
    
    public void setEstCandidat(Boolean estCandidat) {
        this.estCandidat = estCandidat;
    }

    public Long getAssembleeId() {
        return assembleeId;
    }
    
    public void setAssembleeId(Long assembleeId) {
        this.assembleeId = assembleeId;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }

    public Long getResolutionId() {
        return resolutionId;
    }
    
    public void setResolutionId(Long resolutionId) {
        this.resolutionId = resolutionId;
    }
}
