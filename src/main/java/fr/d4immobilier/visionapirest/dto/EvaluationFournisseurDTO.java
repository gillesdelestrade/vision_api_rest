package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class EvaluationFournisseurDTO {

    private Long id;
    private Long fournisseurId;
    private Long auteurId;
    private Long interventionDemandeId;
    private Long factureFournisseurId;
    private Long demandeDevisFournisseurId;
    private String commentaire;
    private Integer noteReactivite;
    private Integer notePrix;
    private Integer noteQualite;
    private String dateEvaluation; // Enum converti en String

    // Constructeur
    public EvaluationFournisseurDTO() {
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(Long fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    public Long getAuteurId() {
        return auteurId;
    }

    public void setAuteurId(Long auteurId) {
        this.auteurId = auteurId;
    }

    public Long getInterventionDemandeId() {
        return interventionDemandeId;
    }

    public void setInterventionDemandeId(Long interventionDemandeId) {
        this.interventionDemandeId = interventionDemandeId;
    }

    public Long getFactureFournisseurId() {
        return factureFournisseurId;
    }

    public void setFactureFournisseurId(Long factureFournisseurId) {
        this.factureFournisseurId = factureFournisseurId;
    }

    public Long getDemandeDevisFournisseurId() {
        return demandeDevisFournisseurId;
    }

    public void setDemandeDevisFournisseurId(Long demandeDevisFournisseurId) {
        this.demandeDevisFournisseurId = demandeDevisFournisseurId;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Integer getNoteReactivite() {
        return noteReactivite;
    }

    public void setNoteReactivite(Integer noteReactivite) {
        this.noteReactivite = noteReactivite;
    }

    public Integer getNotePrix() {
        return notePrix;
    }

    public void setNotePrix(Integer notePrix) {
        this.notePrix = notePrix;
    }

    public Integer getNoteQualite() {
        return noteQualite;
    }

    public void setNoteQualite(Integer noteQualite) {
        this.noteQualite = noteQualite;
    }

    public String getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(String dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }
}
