package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AgenceDTO {
    
    private Long id;
    private String nom;
    private Long responsableId;
    private Long adresseId;

    // Constructeur
    public AgenceDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getResponsableId() {
        return responsableId;
    }
    
    public void setResponsableId(Long responsableId) {
        this.responsableId = responsableId;
    }

    public Long getAdresseId() {
        return adresseId;
    }
    
    public void setAdresseId(Long adresseId) {
        this.adresseId = adresseId;
    }
}
