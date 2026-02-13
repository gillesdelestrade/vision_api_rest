package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class TireurChequeDTO {
    
    private Long id;
    private String nomTireurCheque;
    private String numeroBanque;
    private String numeroCompte;

    // Constructeur
    public TireurChequeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNomTireurCheque() {
        return nomTireurCheque;
    }
    
    public void setNomTireurCheque(String nomTireurCheque) {
        this.nomTireurCheque = nomTireurCheque;
    }

    public String getNumeroBanque() {
        return numeroBanque;
    }
    
    public void setNumeroBanque(String numeroBanque) {
        this.numeroBanque = numeroBanque;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }
    
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
}
