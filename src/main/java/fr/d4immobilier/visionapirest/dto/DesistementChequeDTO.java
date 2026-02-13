package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DesistementChequeDTO {
    
    private Long id;
    private Double montant;
    private LocalDate dateCheque;
    private String numeroCheque;
    private String nomTireurCheque;
    private LocalDate dateDesistement;
    private Long coproprietaireId;
    private Long banqueId;
    private Long courrierDesistementId;
    private Long courrierChequeRetrouveId;
    private Long coproprieteId;

    // Constructeur
    public DesistementChequeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }
    
    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public LocalDate getDateCheque() {
        return dateCheque;
    }
    
    public void setDateCheque(LocalDate dateCheque) {
        this.dateCheque = dateCheque;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }
    
    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getNomTireurCheque() {
        return nomTireurCheque;
    }
    
    public void setNomTireurCheque(String nomTireurCheque) {
        this.nomTireurCheque = nomTireurCheque;
    }

    public LocalDate getDateDesistement() {
        return dateDesistement;
    }
    
    public void setDateDesistement(LocalDate dateDesistement) {
        this.dateDesistement = dateDesistement;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }

    public Long getBanqueId() {
        return banqueId;
    }
    
    public void setBanqueId(Long banqueId) {
        this.banqueId = banqueId;
    }

    public Long getCourrierDesistementId() {
        return courrierDesistementId;
    }
    
    public void setCourrierDesistementId(Long courrierDesistementId) {
        this.courrierDesistementId = courrierDesistementId;
    }

    public Long getCourrierChequeRetrouveId() {
        return courrierChequeRetrouveId;
    }
    
    public void setCourrierChequeRetrouveId(Long courrierChequeRetrouveId) {
        this.courrierChequeRetrouveId = courrierChequeRetrouveId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
