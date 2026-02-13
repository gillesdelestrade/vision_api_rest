package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class SessionTraitementADFDTO {
    
    private Long id;
    private LocalDate dateCreation;
    private LocalDate dateTraitement;
    private Long fichierZipId; // Enum converti en String
    private String libelle;

    // Constructeur
    public SessionTraitementADFDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }
    
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getDateTraitement() {
        return dateTraitement;
    }
    
    public void setDateTraitement(LocalDate dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    public Long getFichierZipId() {
        return fichierZipId;
    }
    
    public void setFichierZipId(Long fichierZipId) {
        this.fichierZipId = fichierZipId;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
