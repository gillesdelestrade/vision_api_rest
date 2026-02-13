package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class FichierBonDeLivraisonDTO {
    
    private Long id;
    private Long livraisonId;

    // Constructeur
    public FichierBonDeLivraisonDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getLivraisonId() {
        return livraisonId;
    }
    
    public void setLivraisonId(Long livraisonId) {
        this.livraisonId = livraisonId;
    }
}
