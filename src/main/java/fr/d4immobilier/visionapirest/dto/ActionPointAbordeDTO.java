package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ActionPointAbordeDTO {
    
    private Long id;
    private Long pointAbordeId;

    // Constructeur
    public ActionPointAbordeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getPointAbordeId() {
        return pointAbordeId;
    }
    
    public void setPointAbordeId(Long pointAbordeId) {
        this.pointAbordeId = pointAbordeId;
    }
}
