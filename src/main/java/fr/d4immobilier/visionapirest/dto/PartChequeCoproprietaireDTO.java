package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PartChequeCoproprietaireDTO {
    
    private Long id;
    private Float montantPart;
    private Long chequeId;
    private Long coproprietaireId;

    // Constructeur
    public PartChequeCoproprietaireDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Float getMontantPart() {
        return montantPart;
    }
    
    public void setMontantPart(Float montantPart) {
        this.montantPart = montantPart;
    }

    public Long getChequeId() {
        return chequeId;
    }
    
    public void setChequeId(Long chequeId) {
        this.chequeId = chequeId;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }
}
