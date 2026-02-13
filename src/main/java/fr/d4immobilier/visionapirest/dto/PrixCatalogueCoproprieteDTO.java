package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PrixCatalogueCoproprieteDTO {
    
    private Long id;
    private Double prix;
    private Long tarifId;
    private Long produitCatalogueId;
    private Long coproprieteId;

    // Constructeur
    public PrixCatalogueCoproprieteDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrix() {
        return prix;
    }
    
    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Long getTarifId() {
        return tarifId;
    }
    
    public void setTarifId(Long tarifId) {
        this.tarifId = tarifId;
    }

    public Long getProduitCatalogueId() {
        return produitCatalogueId;
    }
    
    public void setProduitCatalogueId(Long produitCatalogueId) {
        this.produitCatalogueId = produitCatalogueId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
