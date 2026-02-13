package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MotifDecisionFactureDTO {
    
    private Long id;
    private String motif;
    private String avisD4; // Enum converti en String
    private String contenuMailType;

    // Constructeur
    public MotifDecisionFactureDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getMotif() {
        return motif;
    }
    
    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getAvisD4() {
        return avisD4;
    }
    
    public void setAvisD4(String avisD4) {
        this.avisD4 = avisD4;
    }

    public String getContenuMailType() {
        return contenuMailType;
    }
    
    public void setContenuMailType(String contenuMailType) {
        this.contenuMailType = contenuMailType;
    }
}
