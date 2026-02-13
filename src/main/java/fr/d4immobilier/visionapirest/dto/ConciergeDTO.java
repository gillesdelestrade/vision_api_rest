package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ConciergeDTO {
    
    private Long id;
    private String numeroAdherentMedecineDuTravail;
    private Long coproprieteId;

    // Constructeur
    public ConciergeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroAdherentMedecineDuTravail() {
        return numeroAdherentMedecineDuTravail;
    }
    
    public void setNumeroAdherentMedecineDuTravail(String numeroAdherentMedecineDuTravail) {
        this.numeroAdherentMedecineDuTravail = numeroAdherentMedecineDuTravail;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
