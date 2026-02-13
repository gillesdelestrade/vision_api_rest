package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class ActionDTO {
    
    private Long id;
    private String dateCreation; // Enum converti en String
    private String datePrevue; // Enum converti en String
    private String dateRealisation; // Enum converti en String
    private String importance; // Enum converti en String
    private String urgence; // Enum converti en String
    private String libelle;
    private String commentaire;
    private LocalDate notBefore;
    private LocalDate dateSignaleTermineParCoproprietaire;
    private Long courrierId;
    private Long emetteurId;
    private Long executeurId;
    private Long coproprieteId;
    private Long personneSignalantTermineId;

    // Constructeur
    public ActionDTO() {
    }
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDateCreation() {
        return dateCreation;
    }
    
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDatePrevue() {
        return datePrevue;
    }
    
    public void setDatePrevue(String datePrevue) {
        this.datePrevue = datePrevue;
    }

    public String getDateRealisation() {
        return dateRealisation;
    }
    
    public void setDateRealisation(String dateRealisation) {
        this.dateRealisation = dateRealisation;
    }

    public String getImportance() {
        return importance;
    }
    
    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getUrgence() {
        return urgence;
    }
    
    public void setUrgence(String urgence) {
        this.urgence = urgence;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCommentaire() {
        return commentaire;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public LocalDate getNotBefore() {
        return notBefore;
    }
    
    public void setNotBefore(LocalDate notBefore) {
        this.notBefore = notBefore;
    }

    public LocalDate getDateSignaleTermineParCoproprietaire() {
        return dateSignaleTermineParCoproprietaire;
    }
    
    public void setDateSignaleTermineParCoproprietaire(LocalDate dateSignaleTermineParCoproprietaire) {
        this.dateSignaleTermineParCoproprietaire = dateSignaleTermineParCoproprietaire;
    }

    public Long getCourrierId() {
        return courrierId;
    }
    
    public void setCourrierId(Long courrierId) {
        this.courrierId = courrierId;
    }

    public Long getEmetteurId() {
        return emetteurId;
    }
    
    public void setEmetteurId(Long emetteurId) {
        this.emetteurId = emetteurId;
    }

    public Long getExecuteurId() {
        return executeurId;
    }
    
    public void setExecuteurId(Long executeurId) {
        this.executeurId = executeurId;
    }

    public Long getCoproprieteId() {
        return coproprieteId;
    }
    
    public void setCoproprieteId(Long coproprieteId) {
        this.coproprieteId = coproprieteId;
    }

    public Long getPersonneSignalantTermineId() {
        return personneSignalantTermineId;
    }
    
    public void setPersonneSignalantTermineId(Long personneSignalantTermineId) {
        this.personneSignalantTermineId = personneSignalantTermineId;
    }
}
