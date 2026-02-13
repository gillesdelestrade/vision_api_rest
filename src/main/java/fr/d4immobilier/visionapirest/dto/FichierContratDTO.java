package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierContratDTO {
    
    private Long id;
    private Long contratFournisseurId;

    // Constructeur
    public FichierContratDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getContratFournisseurId() {
        return contratFournisseurId;
    }
    
    public void setContratFournisseurId(Long contratFournisseurId) {
        this.contratFournisseurId = contratFournisseurId;
    }
}
