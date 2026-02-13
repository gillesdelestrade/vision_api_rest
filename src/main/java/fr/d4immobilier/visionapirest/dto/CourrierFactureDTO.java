package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CourrierFactureDTO {
    
    private Long id;
    private Long factureFournisseurId;

    // Constructeur
    public CourrierFactureDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getFactureFournisseurId() {
        return factureFournisseurId;
    }
    
    public void setFactureFournisseurId(Long factureFournisseurId) {
        this.factureFournisseurId = factureFournisseurId;
    }
}
