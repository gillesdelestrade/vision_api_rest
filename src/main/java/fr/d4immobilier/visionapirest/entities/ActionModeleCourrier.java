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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ActionModeleCourrier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private Integer delaiEnJours;
    @ManyToOne(fetch = FetchType.LAZY)
    private ModeleCourrier modeleCourrier;

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
        if (!(object instanceof ActionModeleCourrier)) {
            return false;
        }
        ActionModeleCourrier other = (ActionModeleCourrier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.ActionModeleCourrier[id=" + id + "]";
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the delaiEnJours
     */
    public Integer getDelaiEnJours() {
        return delaiEnJours;
    }

    /**
     * @param delaiEnJours the delaiEnJours to set
     */
    public void setDelaiEnJours(Integer delaiEnJours) {
        this.delaiEnJours = delaiEnJours;
    }

    /**
     * @return the modeleCourrier
     */
    public ModeleCourrier getModeleCourrier() {
        return modeleCourrier;
    }

    /**
     * @param modeleCourrier the modeleCourrier to set
     */
    public void setModeleCourrier(ModeleCourrier modeleCourrier) {
        this.modeleCourrier = modeleCourrier;
    }

}
