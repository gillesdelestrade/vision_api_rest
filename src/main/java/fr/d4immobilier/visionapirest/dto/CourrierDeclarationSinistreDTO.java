package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CourrierDeclarationSinistreDTO {
    
    private Long id;
    private Long sinistreId;

    // Constructeur
    public CourrierDeclarationSinistreDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getSinistreId() {
        return sinistreId;
    }
    
    public void setSinistreId(Long sinistreId) {
        this.sinistreId = sinistreId;
    }
}
