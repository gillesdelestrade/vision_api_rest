package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class BonDeCommandeDTO {
    
    private Long id;
    private Long documentBonDeCommandeId;

    // Constructeur
    public BonDeCommandeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getDocumentBonDeCommandeId() {
        return documentBonDeCommandeId;
    }
    
    public void setDocumentBonDeCommandeId(Long documentBonDeCommandeId) {
        this.documentBonDeCommandeId = documentBonDeCommandeId;
    }
}
