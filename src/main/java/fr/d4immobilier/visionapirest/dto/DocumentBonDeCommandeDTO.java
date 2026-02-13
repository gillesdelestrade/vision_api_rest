package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DocumentBonDeCommandeDTO {
    
    private Long id;
    private Long bonDeCommandeId;

    // Constructeur
    public DocumentBonDeCommandeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getBonDeCommandeId() {
        return bonDeCommandeId;
    }
    
    public void setBonDeCommandeId(Long bonDeCommandeId) {
        this.bonDeCommandeId = bonDeCommandeId;
    }
}
