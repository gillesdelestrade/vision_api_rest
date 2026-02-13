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
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class RejetPrelevement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    private LocalDate  dateTraitement;
    @OneToOne(fetch = FetchType.LAZY)
    private MouvementBancaire mouvementBancaire;
    @OneToOne(fetch = FetchType.LAZY)
    private Fichier fichier;
    private String commentaire;
    

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
        if (!(object instanceof RejetPrelevement)) {
            return false;
        }
        RejetPrelevement other = (RejetPrelevement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.RejetPrelevement[ id=" + id + " ]";
    }

    /**
     * @return the coproprietaire
     */
    public Coproprietaire getCoproprietaire() {
        return coproprietaire;
    }

    /**
     * @param coproprietaire the coproprietaire to set
     */
    public void setCoproprietaire(Coproprietaire coproprietaire) {
        this.coproprietaire = coproprietaire;
    }

    /**
     * @return the dateTraitement
     */
    public LocalDate getDateTraitement() {
        return dateTraitement;
    }

    /**
     * @param dateTraitement the dateTraitement to set
     */
    public void setDateTraitement(LocalDate dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    /**
     * @return the mouvementBancaire
     */
    public MouvementBancaire getMouvementBancaire() {
        return mouvementBancaire;
    }

    /**
     * @param mouvementBancaire the mouvementBancaire to set
     */
    public void setMouvementBancaire(MouvementBancaire mouvementBancaire) {
        this.mouvementBancaire = mouvementBancaire;
    }

    /**
     * @return the fichier
     */
    public Fichier getFichier() {
        return fichier;
    }

    /**
     * @param fichier the fichier to set
     */
    public void setFichier(Fichier fichier) {
        this.fichier = fichier;
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
    
}
