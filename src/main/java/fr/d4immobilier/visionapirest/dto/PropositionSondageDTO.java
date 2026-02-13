package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class PropositionSondageDTO {
    
    private Long id;
    private String texte;
    private Long fichierId;
    private Long sondageId;

    // Constructeur
    public PropositionSondageDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTexte() {
        return texte;
    }
    
    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Long getFichierId() {
        return fichierId;
    }
    
    public void setFichierId(Long fichierId) {
        this.fichierId = fichierId;
    }

    public Long getSondageId() {
        return sondageId;
    }
    
    public void setSondageId(Long sondageId) {
        this.sondageId = sondageId;
    }
}
