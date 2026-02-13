package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ActionPVAGDTO {
    
    private Long id;
    private Long pvagId;

    // Constructeur
    public ActionPVAGDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getPvagId() {
        return pvagId;
    }
    
    public void setPvagId(Long pvagId) {
        this.pvagId = pvagId;
    }
}
