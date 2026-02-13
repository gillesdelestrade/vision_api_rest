package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ChequeDTO {
    
    private Long id;
    private String numero;
    private Float montant;
    private LocalDate dateEncaissementSouhaite;
    private Long banqueId;
    private Long emetteurPersonneId;
    private Long emetteurSocieteId;
    private Long bordereauDeRemiseDeChequeId;
    private Long emetteurCoproprieteId;
    private Long tireurChequeId;

    // Constructeur
    public ChequeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Float getMontant() {
        return montant;
    }
    
    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public LocalDate getDateEncaissementSouhaite() {
        return dateEncaissementSouhaite;
    }
    
    public void setDateEncaissementSouhaite(LocalDate dateEncaissementSouhaite) {
        this.dateEncaissementSouhaite = dateEncaissementSouhaite;
    }

    public Long getBanqueId() {
        return banqueId;
    }
    
    public void setBanqueId(Long banqueId) {
        this.banqueId = banqueId;
    }

    public Long getEmetteurPersonneId() {
        return emetteurPersonneId;
    }
    
    public void setEmetteurPersonneId(Long emetteurPersonneId) {
        this.emetteurPersonneId = emetteurPersonneId;
    }

    public Long getEmetteurSocieteId() {
        return emetteurSocieteId;
    }
    
    public void setEmetteurSocieteId(Long emetteurSocieteId) {
        this.emetteurSocieteId = emetteurSocieteId;
    }

    public Long getBordereauDeRemiseDeChequeId() {
        return bordereauDeRemiseDeChequeId;
    }
    
    public void setBordereauDeRemiseDeChequeId(Long bordereauDeRemiseDeChequeId) {
        this.bordereauDeRemiseDeChequeId = bordereauDeRemiseDeChequeId;
    }

    public Long getEmetteurCoproprieteId() {
        return emetteurCoproprieteId;
    }
    
    public void setEmetteurCoproprieteId(Long emetteurCoproprieteId) {
        this.emetteurCoproprieteId = emetteurCoproprieteId;
    }

    public Long getTireurChequeId() {
        return tireurChequeId;
    }
    
    public void setTireurChequeId(Long tireurChequeId) {
        this.tireurChequeId = tireurChequeId;
    }
}
