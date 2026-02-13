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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PouvoirAG implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaireReceveur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coproprietaire coproprietaireDonneur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Assemblee assemblee;

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
        if (!(object instanceof PouvoirAG)) {
            return false;
        }
        PouvoirAG other = (PouvoirAG) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PouvoirAG[ id=" + id + " ]";
    }

    /**
     * @return the coproprietaireReceveur
     */
    public Coproprietaire getCoproprietaireReceveur() {
        return coproprietaireReceveur;
    }

    /**
     * @param coproprietaireReceveur the coproprietaireReceveur to set
     */
    public void setCoproprietaireReceveur(Coproprietaire coproprietaireReceveur) {
        this.coproprietaireReceveur = coproprietaireReceveur;
    }

    /**
     * @return the coproprietaireDonneur
     */
    public Coproprietaire getCoproprietaireDonneur() {
        return coproprietaireDonneur;
    }

    /**
     * @param coproprietaireDonneur the coproprietaireDonneur to set
     */
    public void setCoproprietaireDonneur(Coproprietaire coproprietaireDonneur) {
        this.coproprietaireDonneur = coproprietaireDonneur;
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
    
}
