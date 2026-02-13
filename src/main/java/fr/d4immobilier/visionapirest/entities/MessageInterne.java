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
public class MessageInterne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne auteur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne destinataire;
    private String message;
    private Instant dateEmission;
    private Boolean prisEnCompte;
    private transient int modeAffichage;
    public final transient static int NORMAL = 0;
    public final transient static int PLUSIEURS_LIGNES = 1;

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
        if (!(object instanceof MessageInterne)) {
            return false;
        }
        MessageInterne other = (MessageInterne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (getModeAffichage() == NORMAL) {
            return getMessage();
        } else {
            int largeurMax = 30;
            String texte = getMessage();
            int caracteresRestants = texte.length();
            int indexCourant = 0;
            while (caracteresRestants > largeurMax) {
                String temp = texte.substring(indexCourant, indexCourant + largeurMax);
                int indexDernierEspace = temp.lastIndexOf(" ");
                if (indexDernierEspace == -1) {
                    indexDernierEspace = largeurMax;
                }
                texte = texte.substring(0, indexCourant + indexDernierEspace) + "\n" + texte.substring(indexCourant + indexDernierEspace + 1);
                caracteresRestants = texte.length() - (indexCourant + indexDernierEspace + 1);
                indexCourant = indexCourant + indexDernierEspace + 1;
            }
            return texte;        
        }
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
     * @return the destinataire
     */
    public Personne getDestinataire() {
        return destinataire;
    }

    /**
     * @param destinataire the destinataire to set
     */
    public void setDestinataire(Personne destinataire) {
        this.destinataire = destinataire;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the dateEmission
     */
    public Instant getDateEmission() {
        return dateEmission;
    }

    /**
     * @param dateEmission the dateEmission to set
     */
    public void setDateEmission(Instant dateEmission) {
        this.dateEmission = dateEmission;
    }

    /**
     * @return the prisEnCompte
     */
    public Boolean getPrisEnCompte() {
        return prisEnCompte;
    }

    /**
     * @param prisEnCompte the prisEnCompte to set
     */
    public void setPrisEnCompte(Boolean prisEnCompte) {
        this.prisEnCompte = prisEnCompte;
    }

    /**
     * @return the modeAffichage
     */
    public int getModeAffichage() {
        return modeAffichage;
    }

    /**
     * @param modeAffichage the modeAffichage to set
     */
    public void setModeAffichage(int modeAffichage) {
        this.modeAffichage = modeAffichage;
    }
}
