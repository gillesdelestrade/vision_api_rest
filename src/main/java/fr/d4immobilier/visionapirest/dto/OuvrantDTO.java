package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class OuvrantDTO {
    
    private Long id;
    private String typeOuvrant; // Enum converti en String
    private String libelle;
    private String description;
    private String code;
    private Boolean moyenAccesUniqueParEmplacement;
    private Long coproprieteId;

    // Constructeur
    public OuvrantDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeOuvrant() {
        return typeOuvrant;
    }
    
    public void setTypeOuvrant(String typeOuvrant) {
        this.typeOuvrant = typeOuvrant;
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

    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getMoyenAccesUniqueParEmplacement() {
        return moyenAccesUniqueParEmplacement;
    }
    
    public void setMoyenAccesUniqueParEmplacement(Boolean moyenAccesUniqueParEmplacement) {
        this.moyenAccesUniqueParEmplacement = moyenAccesUniqueParEmplacement;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }
}
