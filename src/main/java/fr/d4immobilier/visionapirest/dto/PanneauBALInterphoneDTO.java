package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PanneauBALInterphoneDTO {
    
    private Long id;
    private String typePanneau; // Enum converti en String
    private Integer nbColonnes;
    private Integer nbLignes;
    private String libelle;
    private Long coproprieteId;
    private Long batimentId;

    // Constructeur
    public PanneauBALInterphoneDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypePanneau() {
        return typePanneau;
    }
    
    public void setTypePanneau(String typePanneau) {
        this.typePanneau = typePanneau;
    }

    public Integer getNbColonnes() {
        return nbColonnes;
    }
    
    public void setNbColonnes(Integer nbColonnes) {
        this.nbColonnes = nbColonnes;
    }

    public Integer getNbLignes() {
        return nbLignes;
    }
    
    public void setNbLignes(Integer nbLignes) {
        this.nbLignes = nbLignes;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getBatimentId() {
        return batimentId;
    }
    
    public void setBatimentId(Long batimentId) {
        this.batimentId = batimentId;
    }
}
