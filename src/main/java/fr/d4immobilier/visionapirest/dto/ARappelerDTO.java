package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ARappelerDTO {
    
    private Long id;
    private LocalDate dateButoire;
    private String postIt;
    private String consigne;
    private Boolean actif;
    private Boolean ack;

    // Constructeur
    public ARappelerDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateButoire() {
        return dateButoire;
    }
    
    public void setDateButoire(LocalDate dateButoire) {
        this.dateButoire = dateButoire;
    }

    public String getPostIt() {
        return postIt;
    }
    
    public void setPostIt(String postIt) {
        this.postIt = postIt;
    }

    public String getConsigne() {
        return consigne;
    }
    
    public void setConsigne(String consigne) {
        this.consigne = consigne;
    }

    public Boolean getActif() {
        return actif;
    }
    
    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public Boolean getAck() {
        return ack;
    }
    
    public void setAck(Boolean ack) {
        this.ack = ack;
    }
}
