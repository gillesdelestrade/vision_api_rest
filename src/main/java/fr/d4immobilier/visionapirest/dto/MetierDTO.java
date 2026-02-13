package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MetierDTO {
    
    private Long id;
    private String metier;

    // Constructeur
    public MetierDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getMetier() {
        return metier;
    }
    
    public void setMetier(String metier) {
        this.metier = metier;
    }
}
