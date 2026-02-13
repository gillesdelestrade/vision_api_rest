package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class SuppressionFraisDeRelanceDTO {
    
    private Long id;
    private LocalDate dateDemandeSuppression;
    private String motif;
    private Boolean fraisSupprimes;
    private Long coproprietaireId;
    private Long coproprieteId;

    // Constructeur
    public SuppressionFraisDeRelanceDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDemandeSuppression() {
        return dateDemandeSuppression;
    }
    
    public void setDateDemandeSuppression(LocalDate dateDemandeSuppression) {
        this.dateDemandeSuppression = dateDemandeSuppression;
    }

    public String getMotif() {
        return motif;
    }
    
    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Boolean getFraisSupprimes() {
        return fraisSupprimes;
    }
    
    public void setFraisSupprimes(Boolean fraisSupprimes) {
        this.fraisSupprimes = fraisSupprimes;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
