/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EvaluationFournisseur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Fournisseur fournisseur;
    private Personne auteur;
    private InterventionDemande interventionDemande;
    private FactureFournisseur factureFournisseur;
    private DemandeDevisFournisseur demandeDevisFournisseur;
    private String commentaire;
    private Integer noteReactivite;
    private Integer notePrix;
    private Integer noteQualite;
    private Instant dateEvaluation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaluationFournisseur)) {
            return false;
        }
        EvaluationFournisseur other = (EvaluationFournisseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EvaluationFournisseur[ id=" + id + " ]";
    }

    /**
     * @return the fournisseur
     */
    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    /**
     * @param fournisseur the fournisseur to set
     */
    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    /**
     * @return the auteur
     */
    public Personne getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the interventionDemande
     */
    public InterventionDemande getInterventionDemande() {
        return interventionDemande;
    }

    /**
     * @param interventionDemande the interventionDemande to set
     */
    public void setInterventionDemande(InterventionDemande interventionDemande) {
        this.interventionDemande = interventionDemande;
    }

    /**
     * @return the factureFournisseur
     */
    public FactureFournisseur getFactureFournisseur() {
        return factureFournisseur;
    }

    /**
     * @param factureFournisseur the factureFournisseur to set
     */
    public void setFactureFournisseur(FactureFournisseur factureFournisseur) {
        this.factureFournisseur = factureFournisseur;
    }

    /**
     * @return the demandeDevisFournisseur
     */
    public DemandeDevisFournisseur getDemandeDevisFournisseur() {
        return demandeDevisFournisseur;
    }

    /**
     * @param demandeDevisFournisseur the demandeDevisFournisseur to set
     */
    public void setDemandeDevisFournisseur(DemandeDevisFournisseur demandeDevisFournisseur) {
        this.demandeDevisFournisseur = demandeDevisFournisseur;
    }

    /**
     * @return the commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * @param commentaire the commentaire to set
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * @return the noteReactivite
     */
    public Integer getNoteReactivite() {
        return noteReactivite;
    }

    /**
     * @param noteReactivite the noteReactivite to set
     */
    public void setNoteReactivite(Integer noteReactivite) {
        this.noteReactivite = noteReactivite;
    }

    /**
     * @return the notePrix
     */
    public Integer getNotePrix() {
        return notePrix;
    }

    /**
     * @param notePrix the notePrix to set
     */
    public void setNotePrix(Integer notePrix) {
        this.notePrix = notePrix;
    }

    /**
     * @return the noteQualite
     */
    public Integer getNoteQualite() {
        return noteQualite;
    }

    /**
     * @param noteQualite the noteQualite to set
     */
    public void setNoteQualite(Integer noteQualite) {
        this.noteQualite = noteQualite;
    }

    /**
     * @return the dateEvaluation
     */
    public Instant getDateEvaluation() {
        return dateEvaluation;
    }

    /**
     * @param dateEvaluation the dateEvaluation to set
     */
    public void setDateEvaluation(Instant dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }
    
}
