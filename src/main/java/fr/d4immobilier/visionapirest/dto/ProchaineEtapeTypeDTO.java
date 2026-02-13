package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ProchaineEtapeTypeDTO {
    
    private Long id;
    private String libelle;
    private String texteRealise;
    private Integer priorite;
    private String texteNonRealise;

    // Constructeur
    public ProchaineEtapeTypeDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTexteRealise() {
        return texteRealise;
    }
    
    public void setTexteRealise(String texteRealise) {
        this.texteRealise = texteRealise;
    }

    public Integer getPriorite() {
        return priorite;
    }
    
    public void setPriorite(Integer priorite) {
        this.priorite = priorite;
    }

    public String getTexteNonRealise() {
        return texteNonRealise;
    }
    
    public void setTexteNonRealise(String texteNonRealise) {
        this.texteNonRealise = texteNonRealise;
    }
}
