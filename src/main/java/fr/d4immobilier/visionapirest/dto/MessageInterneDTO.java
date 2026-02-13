package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class MessageInterneDTO {
    
    private Long id;
    private String message;
    private String dateEmission; // Enum converti en String
    private Boolean prisEnCompte;
    private Long auteurId;
    private Long destinataireId;

    // Constructeur
    public MessageInterneDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateEmission() {
        return dateEmission;
    }
    
    public void setDateEmission(String dateEmission) {
        this.dateEmission = dateEmission;
    }

    public Boolean getPrisEnCompte() {
        return prisEnCompte;
    }
    
    public void setPrisEnCompte(Boolean prisEnCompte) {
        this.prisEnCompte = prisEnCompte;
    }

    public Long getAuteurId() {
        return auteurId;
    }
    
    public void setAuteurId(Long auteurId) {
        this.auteurId = auteurId;
    }

    public Long getDestinataireId() {
        return destinataireId;
    }
    
    public void setDestinataireId(Long destinataireId) {
        this.destinataireId = destinataireId;
    }
}
