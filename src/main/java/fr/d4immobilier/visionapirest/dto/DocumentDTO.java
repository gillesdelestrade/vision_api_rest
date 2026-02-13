package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class DocumentDTO {
    
    private Long id;
    private Long numeroCodeBarre;
    private String dateCreation; // Enum converti en String
    private String commentaire;
    private String contenu;
    private String titre;
    private Long auteurId;
    private Long destinatairePersonneId;
    private Long destinataireSocieteId;

    // Constructeur
    public DocumentDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeroCodeBarre() {
        return numeroCodeBarre;
    }
    
    public void setNumeroCodeBarre(Long numeroCodeBarre) {
        this.numeroCodeBarre = numeroCodeBarre;
    }

    public String getDateCreation() {
        return dateCreation;
    }
    
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getCommentaire() {
        return commentaire;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getContenu() {
        return contenu;
    }
    
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getTitre() {
        return titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Long getAuteurId() {
        return auteurId;
    }
    
    public void setAuteurId(Long auteurId) {
        this.auteurId = auteurId;
    }

    public Long getDestinatairePersonneId() {
        return destinatairePersonneId;
    }
    
    public void setDestinatairePersonneId(Long destinatairePersonneId) {
        this.destinatairePersonneId = destinatairePersonneId;
    }

    public Long getDestinataireSocieteId() {
        return destinataireSocieteId;
    }
    
    public void setDestinataireSocieteId(Long destinataireSocieteId) {
        this.destinataireSocieteId = destinataireSocieteId;
    }
}
