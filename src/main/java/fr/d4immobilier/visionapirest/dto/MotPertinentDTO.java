package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MotPertinentDTO {
    
    private Long id;
    private String mot;
    private Long motCleFournisseurId;

    // Constructeur
    public MotPertinentDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getMot() {
        return mot;
    }
    
    public void setMot(String mot) {
        this.mot = mot;
    }

    public Long getMotCleFournisseurId() {
        return motCleFournisseurId;
    }
    
    public void setMotCleFournisseurId(Long motCleFournisseurId) {
        this.motCleFournisseurId = motCleFournisseurId;
    }
}
