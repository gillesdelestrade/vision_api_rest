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

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class ProchaineEtapeType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private String texteRealise;
    private Integer priorite;
    private String texteNonRealise;
    
    
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
        if (!(object instanceof ProchaineEtapeType)) {
            return false;
        }
        ProchaineEtapeType other = (ProchaineEtapeType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getLibelle();
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
     * @return the texteRealise
     */
    public String getTexteRealise() {
        return texteRealise;
    }

    /**
     * @param texteRealise the texteRealise to set
     */
    public void setTexteRealise(String texteRealise) {
        this.texteRealise = texteRealise;
    }

    /**
     * @return the priorite
     */
    public Integer getPriorite() {
        return priorite;
    }

    /**
     * @param priorite the priorite to set
     */
    public void setPriorite(Integer priorite) {
        this.priorite = priorite;
    }

    /**
     * @return the texteNonRealise
     */
    public String getTexteNonRealise() {
        return texteNonRealise;
    }

    /**
     * @param texteNonRealise the texteNonRealise to set
     */
    public void setTexteNonRealise(String texteNonRealise) {
        this.texteNonRealise = texteNonRealise;
    }
    
}
