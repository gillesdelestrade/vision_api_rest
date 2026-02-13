package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class RegroupementLignesFacturationDTO {
    
    private Long id;
    private String intitule;
    private Long courrierId;
    private Long factureD4Id;

    // Constructeur
    public RegroupementLignesFacturationDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }
    
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Long getCourrierId() {
        return courrierId;
    }
    
    public void setCourrierId(Long courrierId) {
        this.courrierId = courrierId;
    }

    public Long getFactureD4Id() {
        return factureD4Id;
    }
    
    public void setFactureD4Id(Long factureD4Id) {
        this.factureD4Id = factureD4Id;
    }
}
