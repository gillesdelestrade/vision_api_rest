package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierDTO {
    
    private Long id;
    private String nomFichier;
    private String nomStockage;
    private String dateCreation; // Enum converti en String
    private Long courrierPourPieceJointeId;
    private Long auteurId;

    // Constructeur
    public FichierDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNomFichier() {
        return nomFichier;
    }
    
    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public String getNomStockage() {
        return nomStockage;
    }
    
    public void setNomStockage(String nomStockage) {
        this.nomStockage = nomStockage;
    }

    public String getDateCreation() {
        return dateCreation;
    }
    
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getCourrierPourPieceJointeId() {
        return courrierPourPieceJointeId;
    }
    
    public void setCourrierPourPieceJointeId(Long courrierPourPieceJointeId) {
        this.courrierPourPieceJointeId = courrierPourPieceJointeId;
    }

    public Long getAuteurId() {
        return auteurId;
    }
    
    public void setAuteurId(Long auteurId) {
        this.auteurId = auteurId;
    }
}
