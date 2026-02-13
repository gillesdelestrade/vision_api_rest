package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class BanqueDTO {
    
    private Long id;
    private String agence;
    private String lieu;
    private String codeCMC7;

    // Constructeur
    public BanqueDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getAgence() {
        return agence;
    }
    
    public void setAgence(String agence) {
        this.agence = agence;
    }

    public String getLieu() {
        return lieu;
    }
    
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getCodeCMC7() {
        return codeCMC7;
    }
    
    public void setCodeCMC7(String codeCMC7) {
        this.codeCMC7 = codeCMC7;
    }
}
