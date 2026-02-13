package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class OptionTravauxDTO {
    
    private Long id;
    private String description;
    private Float montant;
    private Long resolutionTravauxId;
    private Long resolutionId;
    private Long devisFournisseurId;

    // Constructeur
    public OptionTravauxDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Float getMontant() {
        return montant;
    }
    
    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public Long getResolutionTravauxId() {
        return resolutionTravauxId;
    }
    
    public void setResolutionTravauxId(Long resolutionTravauxId) {
        this.resolutionTravauxId = resolutionTravauxId;
    }

    public Long getResolutionId() {
        return resolutionId;
    }
    
    public void setResolutionId(Long resolutionId) {
        this.resolutionId = resolutionId;
    }

    public Long getDevisFournisseurId() {
        return devisFournisseurId;
    }
    
    public void setDevisFournisseurId(Long devisFournisseurId) {
        this.devisFournisseurId = devisFournisseurId;
    }
}
