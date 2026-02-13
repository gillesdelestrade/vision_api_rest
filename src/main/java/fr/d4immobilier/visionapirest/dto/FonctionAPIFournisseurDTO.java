package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FonctionAPIFournisseurDTO {
    
    private Long id;
    private String urlRequete;
    private String structureDonneesEnvoyees;
    private String structureDonneesRecues;
    private Long aPIFournisseurId;
    private Long lexiqueAPID4Id;

    // Constructeur
    public FonctionAPIFournisseurDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlRequete() {
        return urlRequete;
    }
    
    public void setUrlRequete(String urlRequete) {
        this.urlRequete = urlRequete;
    }

    public String getStructureDonneesEnvoyees() {
        return structureDonneesEnvoyees;
    }
    
    public void setStructureDonneesEnvoyees(String structureDonneesEnvoyees) {
        this.structureDonneesEnvoyees = structureDonneesEnvoyees;
    }

    public String getStructureDonneesRecues() {
        return structureDonneesRecues;
    }
    
    public void setStructureDonneesRecues(String structureDonneesRecues) {
        this.structureDonneesRecues = structureDonneesRecues;
    }

    public Long getAPIFournisseurId() {
        return aPIFournisseurId;
    }
    
    public void setAPIFournisseurId(Long aPIFournisseurId) {
        this.aPIFournisseurId = aPIFournisseurId;
    }

    public Long getLexiqueAPID4Id() {
        return lexiqueAPID4Id;
    }
    
    public void setLexiqueAPID4Id(Long lexiqueAPID4Id) {
        this.lexiqueAPID4Id = lexiqueAPID4Id;
    }
}
