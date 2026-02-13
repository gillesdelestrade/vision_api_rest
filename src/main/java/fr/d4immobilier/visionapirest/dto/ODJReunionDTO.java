package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ODJReunionDTO {
    
    private Long id;
    private String dateCreation; // Enum converti en String
    private String dateModification; // Enum converti en String
    private String dateReunionPrevue; // Enum converti en String
    private Boolean dateProvisoire;
    private String lieuReunion;
    private Long reunionId;

    // Constructeur
    public ODJReunionDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateCreation() {
        return dateCreation;
    }
    
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDateModification() {
        return dateModification;
    }
    
    public void setDateModification(String dateModification) {
        this.dateModification = dateModification;
    }

    public String getDateReunionPrevue() {
        return dateReunionPrevue;
    }
    
    public void setDateReunionPrevue(String dateReunionPrevue) {
        this.dateReunionPrevue = dateReunionPrevue;
    }

    public Boolean getDateProvisoire() {
        return dateProvisoire;
    }
    
    public void setDateProvisoire(Boolean dateProvisoire) {
        this.dateProvisoire = dateProvisoire;
    }

    public String getLieuReunion() {
        return lieuReunion;
    }
    
    public void setLieuReunion(String lieuReunion) {
        this.lieuReunion = lieuReunion;
    }

    public Long getReunionId() {
        return reunionId;
    }
    
    public void setReunionId(Long reunionId) {
        this.reunionId = reunionId;
    }
}
