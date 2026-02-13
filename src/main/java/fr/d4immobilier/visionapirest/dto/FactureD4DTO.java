package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FactureD4DTO {
    
    private Long id;
    private String reference;
    private LocalDate dateFacture;
    private Double montantTotalHT;
    private Double montantTotalTTC;
    private String typeFactureD4; // Enum converti en String
    private String dateValidation; // Enum converti en String
    private String dateEdition; // Enum converti en String
    private LocalDate dateDebutPeriode;
    private LocalDate dateFinPeriode;
    private Long coproprieteId;
    private Long coproprietaireId;
    private Long societeId;

    // Constructeur
    public FactureD4DTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDateFacture() {
        return dateFacture;
    }
    
    public void setDateFacture(LocalDate dateFacture) {
        this.dateFacture = dateFacture;
    }

    public Double getMontantTotalHT() {
        return montantTotalHT;
    }
    
    public void setMontantTotalHT(Double montantTotalHT) {
        this.montantTotalHT = montantTotalHT;
    }

    public Double getMontantTotalTTC() {
        return montantTotalTTC;
    }
    
    public void setMontantTotalTTC(Double montantTotalTTC) {
        this.montantTotalTTC = montantTotalTTC;
    }

    public String getTypeFactureD4() {
        return typeFactureD4;
    }
    
    public void setTypeFactureD4(String typeFactureD4) {
        this.typeFactureD4 = typeFactureD4;
    }

    public String getDateValidation() {
        return dateValidation;
    }
    
    public void setDateValidation(String dateValidation) {
        this.dateValidation = dateValidation;
    }

    public String getDateEdition() {
        return dateEdition;
    }
    
    public void setDateEdition(String dateEdition) {
        this.dateEdition = dateEdition;
    }

    public LocalDate getDateDebutPeriode() {
        return dateDebutPeriode;
    }
    
    public void setDateDebutPeriode(LocalDate dateDebutPeriode) {
        this.dateDebutPeriode = dateDebutPeriode;
    }

    public LocalDate getDateFinPeriode() {
        return dateFinPeriode;
    }
    
    public void setDateFinPeriode(LocalDate dateFinPeriode) {
        this.dateFinPeriode = dateFinPeriode;
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

    public Long getSocieteId() {
        return societeId;
    }
    
    public void setSocieteId(Long societeId) {
        this.societeId = societeId;
    }
}
