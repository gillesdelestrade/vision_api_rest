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
public class PointODJReunion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private ODJReunion oDJReunion;
    @ManyToOne(fetch = FetchType.LAZY)
    private Demande demande;
    @ManyToOne(fetch = FetchType.LAZY)
    private AttenduCS attenduCS;
    private Integer numero;
    private String obtenu;

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
        if (!(object instanceof PointODJReunion)) {
            return false;
        }
        PointODJReunion other = (PointODJReunion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.PointODJReunion[ id=" + id + " ]";
    }

    /**
     * @return the oDJReunion
     */
    public ODJReunion getoDJReunion() {
        return oDJReunion;
    }

    /**
     * @param oDJReunion the oDJReunion to set
     */
    public void setoDJReunion(ODJReunion oDJReunion) {
        this.oDJReunion = oDJReunion;
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
     * @return the attenduCS
     */
    public AttenduCS getAttenduCS() {
        return attenduCS;
    }

    /**
     * @param attenduCS the attenduCS to set
     */
    public void setAttenduCS(AttenduCS attenduCS) {
        this.attenduCS = attenduCS;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the obtenu
     */
    public String getObtenu() {
        return obtenu;
    }

    /**
     * @param obtenu the obtenu to set
     */
    public void setObtenu(String obtenu) {
        this.obtenu = obtenu;
    }

    
    
}
