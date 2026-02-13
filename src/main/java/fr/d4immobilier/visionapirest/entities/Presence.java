/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import jakarta.persistence.FetchType;
import java.time.Instant;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class Presence implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Assemblee assemblee;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaire;
    @OneToOne(mappedBy = "presence",cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private Affectation affectation;

    @Enumerated(EnumType.STRING)
    private StatutPresence statutPresence;
    
    private Instant datePresenceOuReceptionFormulaire;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Resolution resolutionDepart;

    public Presence() {
    }

    public Presence(Assemblee assemblee, Coproprietaire coproprietaire) {
        this.assemblee = assemblee;
        this.coproprietaire = coproprietaire;
    }



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
        if (!(object instanceof Presence)) {
            return false;
        }
        Presence other = (Presence) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.entities.Presence[id=" + id + "]";
    }

    /**
     * @return the assemblee
     */
    public Assemblee getAssemblee() {
        return assemblee;
    }

    /**
     * @param assemblee the assemblee to set
     */
    public void setAssemblee(Assemblee assemblee) {
        this.assemblee = assemblee;
    }

    /**
     * @return the personne
     */
    public Coproprietaire getCoproprietaire() {
        return coproprietaire;
    }

    /**
     * @param personne the personne to set
     */
    public void setCoproprietaire(Coproprietaire coproprietaire) {
        this.coproprietaire = coproprietaire;
    }

    /**
     * @return the affectation
     */
    public Affectation getAffectation() {
        return affectation;
    }

    /**
     * @param affectation the affectation to set
     */
    public void setAffectation(Affectation affectation) {
        this.affectation = affectation;
    }

    /**
     * @return the statutPresence
     */
    public StatutPresence getStatutPresence() {
        return statutPresence;
    }

    /**
     * @param statutPresence the statutPresence to set
     */
    public void setStatutPresence(StatutPresence statutPresence) {
        this.statutPresence = statutPresence;
    }

    /**
     * @return the datePresenceOuReceptionFormulaire
     */
    public Instant getDatePresenceOuReceptionFormulaire() {
        return datePresenceOuReceptionFormulaire;
    }

    /**
     * @param datePresenceOuReceptionFormulaire the datePresenceOuReceptionFormulaire to set
     */
    public void setDatePresenceOuReceptionFormulaire(Instant datePresenceOuReceptionFormulaire) {
        this.datePresenceOuReceptionFormulaire = datePresenceOuReceptionFormulaire;
    }

    /**
     * @return the resolutionDepart
     */
    public Resolution getResolutionDepart() {
        return resolutionDepart;
    }

    /**
     * @param resolutionDepart the resolutionDepart to set
     */
    public void setResolutionDepart(Resolution resolutionDepart) {
        this.resolutionDepart = resolutionDepart;
    }

}
