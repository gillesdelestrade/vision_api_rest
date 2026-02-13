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
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numeroCodeBarre;
    private Instant dateCreation;
    private String commentaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne auteur;

    @ManyToOne(fetch = FetchType.LAZY)
    private Personne destinatairePersonne;
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe destinataireSociete;

    private String contenu;
    private String titre;

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
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.Document[id=" + id + "]";
    }

    /**
     * @return the numeroCodeBarre
     */
    public Long getNumeroCodeBarre() {
        return numeroCodeBarre;
    }

    /**
     * @param numeroCodeBarre the numeroCodeBarre to set
     */
    public void setNumeroCodeBarre(Long numeroCodeBarre) {
        this.numeroCodeBarre = numeroCodeBarre;
    }

    /**
     * @return the dateCreation
     */
    public Instant getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
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
     * @return the destinatairePersonne
     */
    public Personne getDestinatairePersonne() {
        return destinatairePersonne;
    }

    /**
     * @param destinatairePersonne the destinatairePersonne to set
     */
    public void setDestinatairePersonne(Personne destinatairePersonne) {
        this.destinatairePersonne = destinatairePersonne;
    }

    /**
     * @return the destinataireSociete
     */
    public Societe getDestinataireSociete() {
        return destinataireSociete;
    }

    /**
     * @param destinataireSociete the destinataireSociete to set
     */
    public void setDestinataireSociete(Societe destinataireSociete) {
        this.destinataireSociete = destinataireSociete;
    }

    /**
     * @return the contenu
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * @param contenu the contenu to set
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

}
