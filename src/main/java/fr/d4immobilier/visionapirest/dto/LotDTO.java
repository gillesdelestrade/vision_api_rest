package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class LotDTO {
    
    private Long id;
    private String numeroDeLot;
    private String etage;
    private String numeroAppartement;
    private Float surface;
    private String nature;
    private Long batimentId;
    private Long mandataireId;
    private Long coproprieteId;
    private Long representantAGId;

    // Constructeur
    public LotDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDeLot() {
        return numeroDeLot;
    }
    
    public void setNumeroDeLot(String numeroDeLot) {
        this.numeroDeLot = numeroDeLot;
    }

    public String getEtage() {
        return etage;
    }
    
    public void setEtage(String etage) {
        this.etage = etage;
    }

    public String getNumeroAppartement() {
        return numeroAppartement;
    }
    
    public void setNumeroAppartement(String numeroAppartement) {
        this.numeroAppartement = numeroAppartement;
    }

    public Float getSurface() {
        return surface;
    }
    
    public void setSurface(Float surface) {
        this.surface = surface;
    }

    public String getNature() {
        return nature;
    }
    
    public void setNature(String nature) {
        this.nature = nature;
    }

    public Long getBatimentId() {
        return batimentId;
    }
    
    public void setBatimentId(Long batimentId) {
        this.batimentId = batimentId;
    }

    public Long getMandataireId() {
        return mandataireId;
    }
    
    public void setMandataireId(Long mandataireId) {
        this.mandataireId = mandataireId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getRepresentantAGId() {
        return representantAGId;
    }
    
    public void setRepresentantAGId(Long representantAGId) {
        this.representantAGId = representantAGId;
    }
}
