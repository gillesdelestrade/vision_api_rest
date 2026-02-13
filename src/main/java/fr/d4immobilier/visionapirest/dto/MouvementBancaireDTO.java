package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MouvementBancaireDTO {
    
    private Long id;
    private LocalDate dateMouvement;
    private String numeroOperation;
    private String libelle;
    private Double debit;
    private Double credit;
    private String detail;
    private Long compteEnBanqueId;

    // Constructeur
    public MouvementBancaireDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateMouvement() {
        return dateMouvement;
    }
    
    public void setDateMouvement(LocalDate dateMouvement) {
        this.dateMouvement = dateMouvement;
    }

    public String getNumeroOperation() {
        return numeroOperation;
    }
    
    public void setNumeroOperation(String numeroOperation) {
        this.numeroOperation = numeroOperation;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getDebit() {
        return debit;
    }
    
    public void setDebit(Double debit) {
        this.debit = debit;
    }

    public Double getCredit() {
        return credit;
    }
    
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public String getDetail() {
        return detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getCompteEnBanqueId() {
        return compteEnBanqueId;
    }
    
    public void setCompteEnBanqueId(Long compteEnBanqueId) {
        this.compteEnBanqueId = compteEnBanqueId;
    }
}
