package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MoyenAccesCatalogueQuantiteDTO {
    
    private Long id;
    private Integer quantite;
    private Long moyenAccesCatalogueId;

    // Constructeur
    public MoyenAccesCatalogueQuantiteDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantite() {
        return quantite;
    }
    
    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Long getMoyenAccesCatalogueId() {
        return moyenAccesCatalogueId;
    }
    
    public void setMoyenAccesCatalogueId(Long moyenAccesCatalogueId) {
        this.moyenAccesCatalogueId = moyenAccesCatalogueId;
    }
}
