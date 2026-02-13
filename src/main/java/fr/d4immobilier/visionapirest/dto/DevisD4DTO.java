package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DevisD4DTO {
    
    private Long id;
    private String statutDevis; // Enum converti en String
    private Long coproprieteId;

    // Constructeur
    public DevisD4DTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getStatutDevis() {
        return statutDevis;
    }
    
    public void setStatutDevis(String statutDevis) {
        this.statutDevis = statutDevis;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
