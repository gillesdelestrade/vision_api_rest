package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierModeleMoyenAccesDTO {
    
    private Long id;
    private Long modeleMoyenAccesId;

    // Constructeur
    public FichierModeleMoyenAccesDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getModeleMoyenAccesId() {
        return modeleMoyenAccesId;
    }
    
    public void setModeleMoyenAccesId(Long modeleMoyenAccesId) {
        this.modeleMoyenAccesId = modeleMoyenAccesId;
    }
}
