package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EvenementAutorisationDematerialisationDTO {
    
    private Long id;
    private String dateEvenement; // Enum converti en String
    private String texte;
    private Long auteurId;
    private Long autorisationDematerialisationId;

    // Constructeur
    public EvenementAutorisationDematerialisationDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateEvenement() {
        return dateEvenement;
    }
    
    public void setDateEvenement(String dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    public String getTexte() {
        return texte;
    }
    
    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Long getAuteurId() {
        return auteurId;
    }
    
    public void setAuteurId(Long auteurId) {
        this.auteurId = auteurId;
    }

    public Long getAutorisationDematerialisationId() {
        return autorisationDematerialisationId;
    }
    
    public void setAutorisationDematerialisationId(Long autorisationDematerialisationId) {
        this.autorisationDematerialisationId = autorisationDematerialisationId;
    }
}
