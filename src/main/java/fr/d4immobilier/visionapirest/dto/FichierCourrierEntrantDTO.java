package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierCourrierEntrantDTO {
    
    private Long id;
    private Long courrierEntrantId;

    // Constructeur
    public FichierCourrierEntrantDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourrierEntrantId() {
        return courrierEntrantId;
    }
    
    public void setCourrierEntrantId(Long courrierEntrantId) {
        this.courrierEntrantId = courrierEntrantId;
    }
}
