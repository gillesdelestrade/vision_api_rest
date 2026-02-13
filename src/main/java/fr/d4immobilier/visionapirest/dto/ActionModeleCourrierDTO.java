package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ActionModeleCourrierDTO {
    
    private Long id;
    private String libelle;
    private Integer delaiEnJours;
    private Long modeleCourrierId;

    // Constructeur
    public ActionModeleCourrierDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getDelaiEnJours() {
        return delaiEnJours;
    }
    
    public void setDelaiEnJours(Integer delaiEnJours) {
        this.delaiEnJours = delaiEnJours;
    }

    public Long getModeleCourrierId() {
        return modeleCourrierId;
    }
    
    public void setModeleCourrierId(Long modeleCourrierId) {
        this.modeleCourrierId = modeleCourrierId;
    }
}
