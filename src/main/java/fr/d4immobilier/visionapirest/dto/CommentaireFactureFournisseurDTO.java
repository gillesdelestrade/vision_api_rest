package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class CommentaireFactureFournisseurDTO {
    
    private Long id;
    private String dateCommentaire; // Enum converti en String
    private String commentaire;
    private Long factureFournisseurId;
    private Long auteurPersonneId;
    private Long auteurSocieteId;

    // Constructeur
    public CommentaireFactureFournisseurDTO() {
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

    public Long getFactureFournisseurId() {
        return factureFournisseurId;
    }
    
    public void setFactureFournisseurId(Long factureFournisseurId) {
        this.factureFournisseurId = factureFournisseurId;
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
