package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EmplacementPanneauBALInterphoneDTO {
    
    private Long id;
    private Boolean actif;
    private String ligne1;
    private String ligne2;
    private String ligne3;
    private Integer ligne;
    private Integer colonne;
    private String statutEmplacementPlaqueBAL; // Enum converti en String
    private LocalDate dateCommandePrevisionnelle;
    private Long lotId;
    private Long panneauBALInterphoneId;

    // Constructeur
    public EmplacementPanneauBALInterphoneDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActif() {
        return actif;
    }
    
    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public String getLigne1() {
        return ligne1;
    }
    
    public void setLigne1(String ligne1) {
        this.ligne1 = ligne1;
    }

    public String getLigne2() {
        return ligne2;
    }
    
    public void setLigne2(String ligne2) {
        this.ligne2 = ligne2;
    }

    public String getLigne3() {
        return ligne3;
    }
    
    public void setLigne3(String ligne3) {
        this.ligne3 = ligne3;
    }

    public Integer getLigne() {
        return ligne;
    }
    
    public void setLigne(Integer ligne) {
        this.ligne = ligne;
    }

    public Integer getColonne() {
        return colonne;
    }
    
    public void setColonne(Integer colonne) {
        this.colonne = colonne;
    }

    public String getStatutEmplacementPlaqueBAL() {
        return statutEmplacementPlaqueBAL;
    }
    
    public void setStatutEmplacementPlaqueBAL(String statutEmplacementPlaqueBAL) {
        this.statutEmplacementPlaqueBAL = statutEmplacementPlaqueBAL;
    }

    public LocalDate getDateCommandePrevisionnelle() {
        return dateCommandePrevisionnelle;
    }
    
    public void setDateCommandePrevisionnelle(LocalDate dateCommandePrevisionnelle) {
        this.dateCommandePrevisionnelle = dateCommandePrevisionnelle;
    }

    public Long getLotId() {
        return lotId;
    }
    
    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }

    public Long getPanneauBALInterphoneId() {
        return panneauBALInterphoneId;
    }
    
    public void setPanneauBALInterphoneId(Long panneauBALInterphoneId) {
        this.panneauBALInterphoneId = panneauBALInterphoneId;
    }
}
