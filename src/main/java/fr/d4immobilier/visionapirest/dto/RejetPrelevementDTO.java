package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class RejetPrelevementDTO {
    
    private Long id;
    private LocalDate dateTraitement;
    private String commentaire;
    private Long coproprietaireId;
    private Long mouvementBancaireId;
    private Long fichierId;

    // Constructeur
    public RejetPrelevementDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateTraitement() {
        return dateTraitement;
    }
    
    public void setDateTraitement(LocalDate dateTraitement) {
        this.dateTraitement = dateTraitement;
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

    public Long getMouvementBancaireId() {
        return mouvementBancaireId;
    }
    
    public void setMouvementBancaireId(Long mouvementBancaireId) {
        this.mouvementBancaireId = mouvementBancaireId;
    }

    public Long getFichierId() {
        return fichierId;
    }
    
    public void setFichierId(Long fichierId) {
        this.fichierId = fichierId;
    }
}
