/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class EnvoiMail implements Serializable {
    @OneToOne(mappedBy = "envoiMail",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private ARappelerEnvoiMail aRappelerEnvoiMail;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Personne> destinataires;

    private LocalDate dateMail;
    private String texteMail;
    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demande;
    @ManyToOne(fetch = FetchType.LAZY)
    private Dossier dossier;
    @ManyToOne(fetch = FetchType.LAZY)
    private Sinistre sinistre;
    @ManyToOne(fetch = FetchType.LAZY)
    private Copropriete copropriete;
    @ManyToOne(fetch = FetchType.LAZY)
    private Reunion reunion;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fichier fichier;
    

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
        if (!(object instanceof EnvoiMail)) {
            return false;
        }
        EnvoiMail other = (EnvoiMail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.EnvoiMail[ id=" + id + " ]";
    }

    /**
     * @return the destinataires
     */
    public List<Personne> getDestinataires() {
        return destinataires;
    }

    /**
     * @param destinataires the destinataires to set
     */
    public void setDestinataires(List<Personne> destinataires) {
        this.destinataires = destinataires;
    }

    /**
     * @return the dateMail
     */
    public LocalDate getDateMail() {
        return dateMail;
    }

    /**
     * @param dateMail the dateMail to set
     */
    public void setDateMail(LocalDate dateMail) {
        this.dateMail = dateMail;
    }

    /**
     * @return the texteMail
     */
    public String getTexteMail() {
        return texteMail;
    }

    /**
     * @param texteMail the texteMail to set
     */
    public void setTexteMail(String texteMail) {
        this.texteMail = texteMail;
    }

    /**
     * @return the demande
     */
    public Demande getDemande() {
        return demande;
    }

    /**
     * @param demande the demande to set
     */
    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    /**
     * @return the dossier
     */
    public Dossier getDossier() {
        return dossier;
    }

    /**
     * @param dossier the dossier to set
     */
    public void setDossier(Dossier dossier) {
        this.dossier = dossier;
    }

    /**
     * @return the sinistre
     */
    public Sinistre getSinistre() {
        return sinistre;
    }

    /**
     * @param sinistre the sinistre to set
     */
    public void setSinistre(Sinistre sinistre) {
        this.sinistre = sinistre;
    }

    /**
     * @return the copropriete
     */
    public Copropriete getCopropriete() {
        return copropriete;
    }

    /**
     * @param copropriete the copropriete to set
     */
    public void setCopropriete(Copropriete copropriete) {
        this.copropriete = copropriete;
    }

    /**
     * @return the reunion
     */
    public Reunion getReunion() {
        return reunion;
    }

    /**
     * @param reunion the reunion to set
     */
    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
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
     * @return the aRappelerEnvoiMail
     */
    public ARappelerEnvoiMail getaRappelerEnvoiMail() {
        return aRappelerEnvoiMail;
    }

    /**
     * @param aRappelerEnvoiMail the aRappelerEnvoiMail to set
     */
    public void setaRappelerEnvoiMail(ARappelerEnvoiMail aRappelerEnvoiMail) {
        this.aRappelerEnvoiMail = aRappelerEnvoiMail;
    }
    
}
