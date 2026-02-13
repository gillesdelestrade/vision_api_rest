package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class TVADTO {
    
    private Long id;
    private Double taux;

    // Constructeur
    public TVADTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Double getTaux() {
        return taux;
    }
    
    public void setTaux(Double taux) {
        this.taux = taux;
    }
}
