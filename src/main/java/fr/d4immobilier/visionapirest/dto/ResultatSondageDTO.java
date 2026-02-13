package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ResultatSondageDTO {
    
    private Long id;
    private String commentaire;
    private Long coproprietaireId;
    private Long propositionSondageId;

    // Constructeur
    public ResultatSondageDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Long getCoproprietaireId() {
        return coproprietaireId;
    }
    
    public void setCoproprietaireId(Long coproprietaireId) {
        this.coproprietaireId = coproprietaireId;
    }

    public Long getPropositionSondageId() {
        return propositionSondageId;
    }
    
    public void setPropositionSondageId(Long propositionSondageId) {
        this.propositionSondageId = propositionSondageId;
    }
}
