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
public class RappelTelephonique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire auteur;
    @ManyToOne(fetch = FetchType.LAZY)
    private DemandeDeRappel demandeDeRappel;
    private Instant dateRappel;
    private String texte;
    private EtatRappelTelephonique etatRappelTelephonique;

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
        if (!(object instanceof RappelTelephonique)) {
            return false;
        }
        RappelTelephonique other = (RappelTelephonique) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.RappelTelephonique[ id=" + id + " ]";
    }

    /**
     * @return the auteur
     */
    public Gestionnaire getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(Gestionnaire auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the demandeDeRappel
     */
    public DemandeDeRappel getDemandeDeRappel() {
        return demandeDeRappel;
    }

    /**
     * @param demandeDeRappel the demandeDeRappel to set
     */
    public void setDemandeDeRappel(DemandeDeRappel demandeDeRappel) {
        this.demandeDeRappel = demandeDeRappel;
    }

    /**
     * @return the dateRappel
     */
    public Instant getDateRappel() {
        return dateRappel;
    }

    /**
     * @param dateRappel the dateRappel to set
     */
    public void setDateRappel(Instant dateRappel) {
        this.dateRappel = dateRappel;
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
     * @return the etatRappelTelephonique
     */
    public EtatRappelTelephonique getEtatRappelTelephonique() {
        return etatRappelTelephonique;
    }

    /**
     * @param etatRappelTelephonique the etatRappelTelephonique to set
     */
    public void setEtatRappelTelephonique(EtatRappelTelephonique etatRappelTelephonique) {
        this.etatRappelTelephonique = etatRappelTelephonique;
    }
    
}
