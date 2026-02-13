package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MandataireSocieteDTO {
    
    private Long id;
    private Long societeId;

    // Constructeur
    public MandataireSocieteDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getSocieteId() {
        return societeId;
    }
    
    public void setSocieteId(Long societeId) {
        this.societeId = societeId;
    }
}
