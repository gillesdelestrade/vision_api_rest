/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.Column;
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
public class AppelEntrant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Personne appelantPersonne;
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe appelantSociete;
    private Instant dateDebutAppel;
    private Instant dateFinAppel;
    @Column(length=2000)
    private String contenuAppel;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gestionnaire interlocuteurD4;
    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demande;


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
        if (!(object instanceof AppelEntrant)) {
            return false;
        }
        AppelEntrant other = (AppelEntrant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getContenuAppel();
    }

    /**
     * @return the appelantPersonne
     */
    public Personne getAppelantPersonne() {
        return appelantPersonne;
    }

    /**
     * @param appelantPersonne the appelantPersonne to set
     */
    public void setAppelantPersonne(Personne appelantPersonne) {
        this.appelantPersonne = appelantPersonne;
    }

    /**
     * @return the appelantSociete
     */
    public Societe getAppelantSociete() {
        return appelantSociete;
    }

    /**
     * @param appelantSociete the appelantSociete to set
     */
    public void setAppelantSociete(Societe appelantSociete) {
        this.appelantSociete = appelantSociete;
    }

    /**
     * @return the dateDebutAppel
     */
    public Instant getDateDebutAppel() {
        return dateDebutAppel;
    }

    /**
     * @param dateDebutAppel the dateDebutAppel to set
     */
    public void setDateDebutAppel(Instant dateDebutAppel) {
        this.dateDebutAppel = dateDebutAppel;
    }

    /**
     * @return the dateFinAppel
     */
    public Instant getDateFinAppel() {
        return dateFinAppel;
    }

    /**
     * @param dateFinAppel the dateFinAppel to set
     */
    public void setDateFinAppel(Instant dateFinAppel) {
        this.dateFinAppel = dateFinAppel;
    }

    /**
     * @return the contenuAppel
     */
    public String getContenuAppel() {
        return contenuAppel;
    }

    /**
     * @param contenuAppel the contenuAppel to set
     */
    public void setContenuAppel(String contenuAppel) {
        this.contenuAppel = contenuAppel;
    }

    /**
     * @return the interlocuteurD4
     */
    public Gestionnaire getInterlocuteurD4() {
        return interlocuteurD4;
    }

    /**
     * @param interlocuteurD4 the interlocuteurD4 to set
     */
    public void setInterlocuteurD4(Gestionnaire interlocuteurD4) {
        this.interlocuteurD4 = interlocuteurD4;
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

}
