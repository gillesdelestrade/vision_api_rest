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
import jakarta.persistence.ManyToOne;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EvenementAutorisationDematerialisation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dateEvenement;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne auteur;
    private String texte;
    @ManyToOne(fetch = FetchType.LAZY)
    private AutorisationDematerialisation autorisationDematerialisation;

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
        if (!(object instanceof EvenementAutorisationDematerialisation)) {
            return false;
        }
        EvenementAutorisationDematerialisation other = (EvenementAutorisationDematerialisation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EvenementAutorisationDematerialisation[ id=" + id + " ]";
    }

    /**
     * @return the dateEvenement
     */
    public Instant getDateEvenement() {
        return dateEvenement;
    }

    /**
     * @param dateEvenement the dateEvenement to set
     */
    public void setDateEvenement(Instant dateEvenement) {
        this.dateEvenement = dateEvenement;
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
     * @return the texte
     */
    public String getTexte() {
        return texte;
    }

    /**
     * @param texte the texte to set
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * @return the autorisationDematerialisation
     */
    public AutorisationDematerialisation getAutorisationDematerialisation() {
        return autorisationDematerialisation;
    }

    /**
     * @param autorisationDematerialisation the autorisationDematerialisation to set
     */
    public void setAutorisationDematerialisation(AutorisationDematerialisation autorisationDematerialisation) {
        this.autorisationDematerialisation = autorisationDematerialisation;
    }
    
}
