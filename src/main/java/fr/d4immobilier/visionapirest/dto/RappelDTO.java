package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class RappelDTO {
    
    private Long id;
    private LocalDate dateRappel;
    private Long aRappelerId;

    // Constructeur
    public RappelDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateRappel() {
        return dateRappel;
    }
    
    public void setDateRappel(LocalDate dateRappel) {
        this.dateRappel = dateRappel;
    }

    public Long getARappelerId() {
        return aRappelerId;
    }
    
    public void setARappelerId(Long aRappelerId) {
        this.aRappelerId = aRappelerId;
    }
}
