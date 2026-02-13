package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PanierDemandesInterventionDTO {
    
    private Long id;
    private LocalDate dateButoire;
    private Boolean declenche;
    private Long coproprieteId;
    private Long fournisseurId;

    // Constructeur
    public PanierDemandesInterventionDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateButoire() {
        return dateButoire;
    }
    
    public void setDateButoire(LocalDate dateButoire) {
        this.dateButoire = dateButoire;
    }

    public Boolean getDeclenche() {
        return declenche;
    }
    
    public void setDeclenche(Boolean declenche) {
        this.declenche = declenche;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getFournisseurId() {
        return fournisseurId;
    }
    
    public void setFournisseurId(Long fournisseurId) {
        this.fournisseurId = fournisseurId;
    }
}
