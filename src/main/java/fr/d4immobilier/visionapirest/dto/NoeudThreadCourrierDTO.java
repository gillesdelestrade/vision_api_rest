package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class NoeudThreadCourrierDTO {
    
    private Long id;
    private Long pereId;

    // Constructeur
    public NoeudThreadCourrierDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getPereId() {
        return pereId;
    }
    
    public void setPereId(Long pereId) {
        this.pereId = pereId;
    }
}
