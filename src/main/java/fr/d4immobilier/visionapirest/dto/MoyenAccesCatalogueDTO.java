package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MoyenAccesCatalogueDTO {
    
    private Long id;
    private Float prixUnitaire;
    private Float fraisEnvoi;
    private String libelle;
    private String description;
    private Long fournisseurId;
    private Long modeleMoyenAccesId;

    // Constructeur
    public MoyenAccesCatalogueDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrixUnitaire() {
        return prixUnitaire;
    }
    
    public void setPrixUnitaire(Float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Float getFraisEnvoi() {
        return fraisEnvoi;
    }
    
    public void setFraisEnvoi(Float fraisEnvoi) {
        this.fraisEnvoi = fraisEnvoi;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getFournisseurId() {
        return fournisseurId;
    }
    
    public void setFournisseurId(Long fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    public Long getModeleMoyenAccesId() {
        return modeleMoyenAccesId;
    }
    
    public void setModeleMoyenAccesId(Long modeleMoyenAccesId) {
        this.modeleMoyenAccesId = modeleMoyenAccesId;
    }
}
