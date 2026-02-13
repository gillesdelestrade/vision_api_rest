package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierDemandeSansCompteVisionDTO {
    
    private Long id;
    private Long demandeSansCompteVisionId;

    // Constructeur
    public FichierDemandeSansCompteVisionDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getDemandeSansCompteVisionId() {
        return demandeSansCompteVisionId;
    }
    
    public void setDemandeSansCompteVisionId(Long demandeSansCompteVisionId) {
        this.demandeSansCompteVisionId = demandeSansCompteVisionId;
    }
}
