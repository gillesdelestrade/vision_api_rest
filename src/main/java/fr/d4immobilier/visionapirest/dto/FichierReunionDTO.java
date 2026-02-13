package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierReunionDTO {
    
    private Long id;
    private Long reunionId;
    private Long pointAbordeId;

    // Constructeur
    public FichierReunionDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getReunionId() {
        return reunionId;
    }
    
    public void setReunionId(Long reunionId) {
        this.reunionId = reunionId;
    }

    public Long getPointAbordeId() {
        return pointAbordeId;
    }
    
    public void setPointAbordeId(Long pointAbordeId) {
        this.pointAbordeId = pointAbordeId;
    }
}
