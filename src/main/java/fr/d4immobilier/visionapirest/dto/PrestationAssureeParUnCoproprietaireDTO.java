package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PrestationAssureeParUnCoproprietaireDTO {
    
    private Long id;
    private Long coproprieteId;
    private Long coproprietaireId;
    private Long prestationContratId;

    // Constructeur
    public PrestationAssureeParUnCoproprietaireDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }

    public Long getPrestationContratId() {
        return prestationContratId;
    }
    
    public void setPrestationContratId(Long prestationContratId) {
        this.prestationContratId = prestationContratId;
    }
}
