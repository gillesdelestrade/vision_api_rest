package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PrestationContratDTO {
    
    private Long id;
    private String prestation;

    // Constructeur
    public PrestationContratDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getPrestation() {
        return prestation;
    }
    
    public void setPrestation(String prestation) {
        this.prestation = prestation;
    }
}
