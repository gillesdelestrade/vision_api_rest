/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.FetchType;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class AttenduCS implements Serializable {
    @OneToMany(mappedBy = "attenduCS", fetch = FetchType.LAZY)
    private List<TexteATrouAttenduCS> textesATrou;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;

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
        if (!(object instanceof AttenduCS)) {
            return false;
        }
        AttenduCS other = (AttenduCS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "fr.d4immobilier.vision.entities.AttenduCS[ id=" + id + " ]";
        return libelle;
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
     * @return the textesATrou
     */
    public List<TexteATrouAttenduCS> getTextesATrou() {
        return textesATrou;
    }

    /**
     * @param textesATrou the textesATrou to set
     */
    public void setTextesATrou(List<TexteATrouAttenduCS> textesATrou) {
        this.textesATrou = textesATrou;
    }
    
}
