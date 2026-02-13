package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class AudienceDTO {
    
    private Long id;
    private String typeAudience; // Enum converti en String
    private LocalDate dateAudience;
    private String commentaire;
    private Long complementProcedureId;

    // Constructeur
    public AudienceDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeAudience() {
        return typeAudience;
    }
    
    public void setTypeAudience(String typeAudience) {
        this.typeAudience = typeAudience;
    }

    public LocalDate getDateAudience() {
        return dateAudience;
    }
    
    public void setDateAudience(LocalDate dateAudience) {
        this.dateAudience = dateAudience;
    }

    public String getCommentaire() {
        return commentaire;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Long getComplementProcedureId() {
        return complementProcedureId;
    }
    
    public void setComplementProcedureId(Long complementProcedureId) {
        this.complementProcedureId = complementProcedureId;
    }
}
