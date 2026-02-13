package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EtapePlanifAGModeleDTO {
    
    private Long id;
    private Integer numeroOrdre;
    private String libelle;
    private String responsableEtapePlanifAGModele; // Enum converti en String
    private Integer dureeTacheRapide;
    private Integer dureeTacheNormale;
    private Integer dureeTacheLongue;
    private Integer dureeTacheTresLongue;

    // Constructeur
    public EtapePlanifAGModeleDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroOrdre() {
        return numeroOrdre;
    }
    
    public void setNumeroOrdre(Integer numeroOrdre) {
        this.numeroOrdre = numeroOrdre;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getResponsableEtapePlanifAGModele() {
        return responsableEtapePlanifAGModele;
    }
    
    public void setResponsableEtapePlanifAGModele(String responsableEtapePlanifAGModele) {
        this.responsableEtapePlanifAGModele = responsableEtapePlanifAGModele;
    }

    public Integer getDureeTacheRapide() {
        return dureeTacheRapide;
    }
    
    public void setDureeTacheRapide(Integer dureeTacheRapide) {
        this.dureeTacheRapide = dureeTacheRapide;
    }

    public Integer getDureeTacheNormale() {
        return dureeTacheNormale;
    }
    
    public void setDureeTacheNormale(Integer dureeTacheNormale) {
        this.dureeTacheNormale = dureeTacheNormale;
    }

    public Integer getDureeTacheLongue() {
        return dureeTacheLongue;
    }
    
    public void setDureeTacheLongue(Integer dureeTacheLongue) {
        this.dureeTacheLongue = dureeTacheLongue;
    }

    public Integer getDureeTacheTresLongue() {
        return dureeTacheTresLongue;
    }
    
    public void setDureeTacheTresLongue(Integer dureeTacheTresLongue) {
        this.dureeTacheTresLongue = dureeTacheTresLongue;
    }
}
