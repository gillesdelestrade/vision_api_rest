package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class RappelCourrierDTO {
    
    private Long id;
    private Long courrierId;

    // Constructeur
    public RappelCourrierDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourrierId() {
        return courrierId;
    }
    
    public void setCourrierId(Long courrierId) {
        this.courrierId = courrierId;
    }
}
