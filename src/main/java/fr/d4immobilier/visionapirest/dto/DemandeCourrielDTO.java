package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DemandeCourrielDTO {
    
    private Long id;
    private Long courrielId;

    // Constructeur
    public DemandeCourrielDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourrielId() {
        return courrielId;
    }
    
    public void setCourrielId(Long courrielId) {
        this.courrielId = courrielId;
    }
}
