package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CommentaireDevisFournisseurDTO {
    
    private Long id;
    private String dateCommentaire; // Enum converti en String
    private String commentaire;
    private Boolean elementDeDecision;
    private Long devisFournisseurId;
    private Long auteurPersonneId;
    private Long auteurSocieteId;

    // Constructeur
    public CommentaireDevisFournisseurDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateCommentaire() {
        return dateCommentaire;
    }
    
    public void setDateCommentaire(String dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }

    public String getCommentaire() {
        return commentaire;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Boolean getElementDeDecision() {
        return elementDeDecision;
    }
    
    public void setElementDeDecision(Boolean elementDeDecision) {
        this.elementDeDecision = elementDeDecision;
    }

    public Long getDevisFournisseurId() {
        return devisFournisseurId;
    }
    
    public void setDevisFournisseurId(Long devisFournisseurId) {
        this.devisFournisseurId = devisFournisseurId;
    }

    public Long getAuteurPersonneId() {
        return auteurPersonneId;
    }
    
    public void setAuteurPersonneId(Long auteurPersonneId) {
        this.auteurPersonneId = auteurPersonneId;
    }

    public Long getAuteurSocieteId() {
        return auteurSocieteId;
    }
    
    public void setAuteurSocieteId(Long auteurSocieteId) {
        this.auteurSocieteId = auteurSocieteId;
    }
}
