package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class HonorairesSurTravauxDTO {
    
    private Long id;
    private Float valeurEuros;
    private Float valeurPoucents;
    private Long resolutionTravauxId;
    private Long resolutionId;

    // Constructeur
    public HonorairesSurTravauxDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Float getValeurEuros() {
        return valeurEuros;
    }
    
    public void setValeurEuros(Float valeurEuros) {
        this.valeurEuros = valeurEuros;
    }

    public Float getValeurPoucents() {
        return valeurPoucents;
    }
    
    public void setValeurPoucents(Float valeurPoucents) {
        this.valeurPoucents = valeurPoucents;
    }

    public Long getResolutionTravauxId() {
        return resolutionTravauxId;
    }
    
    public void setResolutionTravauxId(Long resolutionTravauxId) {
        this.resolutionTravauxId = resolutionTravauxId;
    }

    public Long getResolutionId() {
        return resolutionId;
    }
    
    public void setResolutionId(Long resolutionId) {
        this.resolutionId = resolutionId;
    }
}
