package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CampagneADFDTO {
    
    private Long id;
    private String libelle;
    private LocalDate dateCreation;
    private Boolean trimestriel;
    private LocalDate dateCloture;

    // Constructeur
    public CampagneADFDTO() {
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

    public LocalDate getDateCreation() {
        return dateCreation;
    }
    
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Boolean getTrimestriel() {
        return trimestriel;
    }
    
    public void setTrimestriel(Boolean trimestriel) {
        this.trimestriel = trimestriel;
    }

    public LocalDate getDateCloture() {
        return dateCloture;
    }
    
    public void setDateCloture(LocalDate dateCloture) {
        this.dateCloture = dateCloture;
    }
}
