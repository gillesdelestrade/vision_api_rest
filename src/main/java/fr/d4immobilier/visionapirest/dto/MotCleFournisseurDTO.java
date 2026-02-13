package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MotCleFournisseurDTO {
    
    private Long id;
    private Long poids;
    private Long motPertinentId;
    private Long fournisseurId;
    private Long coproprieteId;

    // Constructeur
    public MotCleFournisseurDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getPoids() {
        return poids;
    }
    
    public void setPoids(Long poids) {
        this.poids = poids;
    }

    public Long getMotPertinentId() {
        return motPertinentId;
    }
    
    public void setMotPertinentId(Long motPertinentId) {
        this.motPertinentId = motPertinentId;
    }

    public Long getFournisseurId() {
        return fournisseurId;
    }
    
    public void setFournisseurId(Long fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
