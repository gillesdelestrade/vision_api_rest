package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierEmplacementDTO {
    
    private Long id;
    private Long emplacementPanneauBALInterphoneId;

    // Constructeur
    public FichierEmplacementDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmplacementPanneauBALInterphoneId() {
        return emplacementPanneauBALInterphoneId;
    }
    
    public void setEmplacementPanneauBALInterphoneId(Long emplacementPanneauBALInterphoneId) {
        this.emplacementPanneauBALInterphoneId = emplacementPanneauBALInterphoneId;
    }
}
