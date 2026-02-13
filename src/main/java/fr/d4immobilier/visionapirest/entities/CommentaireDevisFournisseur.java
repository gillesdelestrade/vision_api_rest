/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class CommentaireDevisFournisseur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private DevisFournisseur devisFournisseur;
    private Instant dateCommentaire;
    private String commentaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne auteurPersonne;
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe auteurSociete;
    private Boolean elementDeDecision;

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
        if (!(object instanceof CommentaireDevisFournisseur)) {
            return false;
        }
        CommentaireDevisFournisseur other = (CommentaireDevisFournisseur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getCommentaire();
    }

    /**
     * @return the devisFournisseur
     */
    public DevisFournisseur getDevisFournisseur() {
        return devisFournisseur;
    }

    /**
     * @param devisFournisseur the devisFournisseur to set
     */
    public void setDevisFournisseur(DevisFournisseur devisFournisseur) {
        this.devisFournisseur = devisFournisseur;
    }

    /**
     * @return the dateCommentaire
     */
    public Instant getDateCommentaire() {
        return dateCommentaire;
    }

    /**
     * @param dateCommentaire the dateCommentaire to set
     */
    public void setDateCommentaire(Instant dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
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
     * @return the auteurPersonne
     */
    public Personne getAuteurPersonne() {
        return auteurPersonne;
    }

    /**
     * @param auteurPersonne the auteurPersonne to set
     */
    public void setAuteurPersonne(Personne auteurPersonne) {
        this.auteurPersonne = auteurPersonne;
    }

    /**
     * @return the auteurSociete
     */
    public Societe getAuteurSociete() {
        return auteurSociete;
    }

    /**
     * @param auteurSociete the auteurSociete to set
     */
    public void setAuteurSociete(Societe auteurSociete) {
        this.auteurSociete = auteurSociete;
    }

    /**
     * @return the elementDeDecision
     */
    public Boolean getElementDeDecision() {
        return elementDeDecision;
    }

    /**
     * @param elementDeDecision the elementDeDecision to set
     */
    public void setElementDeDecision(Boolean elementDeDecision) {
        this.elementDeDecision = elementDeDecision;
    }

}
