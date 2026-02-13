package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ProduitCatalogueDTO {
    
    private Long id;
    private String reference;
    private String designation;
    private Long tvaId;

    // Constructeur
    public ProduitCatalogueDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Long getTvaId() {
        return tvaId;
    }
    
    public void setTvaId(Long tvaId) {
        this.tvaId = tvaId;
    }
}
