package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FournisseurDTO {
    
    private Long id;
    private String identifiantICS;
    private String permalink;
    private Long compteEnBanqueFournisseurId;

    // Constructeur
    public FournisseurDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentifiantICS() {
        return identifiantICS;
    }
    
    public void setIdentifiantICS(String identifiantICS) {
        this.identifiantICS = identifiantICS;
    }

    public String getPermalink() {
        return permalink;
    }
    
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Long getCompteEnBanqueFournisseurId() {
        return compteEnBanqueFournisseurId;
    }
    
    public void setCompteEnBanqueFournisseurId(Long compteEnBanqueFournisseurId) {
        this.compteEnBanqueFournisseurId = compteEnBanqueFournisseurId;
    }
}
