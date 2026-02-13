package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class BonDeCommandePanierMoyenAccesDTO {
    
    private Long id;
    private Long panierCommandeMoyenAccesId;

    // Constructeur
    public BonDeCommandePanierMoyenAccesDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getPanierCommandeMoyenAccesId() {
        return panierCommandeMoyenAccesId;
    }
    
    public void setPanierCommandeMoyenAccesId(Long panierCommandeMoyenAccesId) {
        this.panierCommandeMoyenAccesId = panierCommandeMoyenAccesId;
    }
}
