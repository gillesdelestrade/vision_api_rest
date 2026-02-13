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
public class AffectationEtiquette implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Etiquette etiquette;
    private Long idObjet;
    private String classeObjet;

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
        if (!(object instanceof AffectationEtiquette)) {
            return false;
        }
        AffectationEtiquette other = (AffectationEtiquette) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.vision.entities.AffectationEtiquette[ id=" + id + " ]";
    }

    /**
     * @return the etiquette
     */
    public Etiquette getEtiquette() {
        return etiquette;
    }

    /**
     * @param etiquette the etiquette to set
     */
    public void setEtiquette(Etiquette etiquette) {
        this.etiquette = etiquette;
    }

    /**
     * @return the idObjet
     */
    public Long getIdObjet() {
        return idObjet;
    }

    /**
     * @param idObjet the idObjet to set
     */
    public void setIdObjet(Long idObjet) {
        this.idObjet = idObjet;
    }

    /**
     * @return the classeObjet
     */
    public String getClasseObjet() {
        return classeObjet;
    }

    /**
     * @param classeObjet the classeObjet to set
     */
    public void setClasseObjet(String classeObjet) {
        this.classeObjet = classeObjet;
    }
    
}
