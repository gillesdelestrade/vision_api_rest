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
public class HistoriqueModificationEtapePlanifAG implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private EtapePlanifAG etapePlanifAG;
    private Instant dateModification;
    private Instant ancienneDateCible;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire ancienActeur;
    private Instant nouvelleDateCible;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire nouvelActeur;
    private ModeModificationEtapePlanifAG modeModification;

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
        if (!(object instanceof HistoriqueModificationEtapePlanifAG)) {
            return false;
        }
        HistoriqueModificationEtapePlanifAG other = (HistoriqueModificationEtapePlanifAG) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.HistoriqueModificationEtapePlanifAG[ id=" + id + " ]";
    }

    /**
     * @return the etapePlanifAG
     */
    public EtapePlanifAG getEtapePlanifAG() {
        return etapePlanifAG;
    }

    /**
     * @param etapePlanifAG the etapePlanifAG to set
     */
    public void setEtapePlanifAG(EtapePlanifAG etapePlanifAG) {
        this.etapePlanifAG = etapePlanifAG;
    }

    /**
     * @return the dateModification
     */
    public Instant getDateModification() {
        return dateModification;
    }

    /**
     * @param dateModification the dateModification to set
     */
    public void setDateModification(Instant dateModification) {
        this.dateModification = dateModification;
    }

    /**
     * @return the ancienneDateCible
     */
    public Instant getAncienneDateCible() {
        return ancienneDateCible;
    }

    /**
     * @param ancienneDateCible the ancienneDateCible to set
     */
    public void setAncienneDateCible(Instant ancienneDateCible) {
        this.ancienneDateCible = ancienneDateCible;
    }

    /**
     * @return the ancienActeur
     */
    public Gestionnaire getAncienActeur() {
        return ancienActeur;
    }

    /**
     * @param ancienActeur the ancienActeur to set
     */
    public void setAncienActeur(Gestionnaire ancienActeur) {
        this.ancienActeur = ancienActeur;
    }

    /**
     * @return the nouvelleDateCible
     */
    public Instant getNouvelleDateCible() {
        return nouvelleDateCible;
    }

    /**
     * @param nouvelleDateCible the nouvelleDateCible to set
     */
    public void setNouvelleDateCible(Instant nouvelleDateCible) {
        this.nouvelleDateCible = nouvelleDateCible;
    }

    /**
     * @return the nouvelActeur
     */
    public Gestionnaire getNouvelActeur() {
        return nouvelActeur;
    }

    /**
     * @param nouvelActeur the nouvelActeur to set
     */
    public void setNouvelActeur(Gestionnaire nouvelActeur) {
        this.nouvelActeur = nouvelActeur;
    }

    /**
     * @return the modeModification
     */
    public ModeModificationEtapePlanifAG getModeModification() {
        return modeModification;
    }

    /**
     * @param modeModification the modeModification to set
     */
    public void setModeModification(ModeModificationEtapePlanifAG modeModification) {
        this.modeModification = modeModification;
    }
    
}
